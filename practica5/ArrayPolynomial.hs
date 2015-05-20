module ArrayPolynomial where

type C = (Int)
type P = ([Int])
type LP = ([P])

x :: P
x = [1,0]

coef :: C  -> P
coef a = [a]

padd :: LP -> P
padd [] = []
padd l  = padd' (head l) (tail l)

padd' :: P -> LP -> P
padd' p (x:xs) = padd' (grandes x p ++ (zipWith (+) (drop (dif x p) (mayor x p)) (menor x p))) xs
padd' p [] = p

grandes :: P -> P -> P
grandes g p = if length g > length p then
				take (length g - length p) g
			else if length g < length p then
				take (length p - length g) p
			else []

dif :: P -> P -> Int
dif g p = if length g > length p then	(length g - length p)
		else if length g < length p then (length p - length g)
		else 0


mayor :: P -> P -> P
mayor g p = if length g >= length p then g
			else p

menor :: P -> P -> P
menor g p = if length g < length p then g
			else p

pmul :: LP -> P
pmul [] = []
pmul l = pmul1 (head l) (tail l)

pmul1 :: P -> LP -> P
pmul1 p [] = p
pmul1 p (x:xs) = pmul1 (padd (pmul2 (mayor x p) (menor x p) (length(mayor x p)))) xs

pmul2 :: P -> P -> Int -> LP
pmul2 (x:xs) p n = [(map (x*) p) ++ (zero (n-1))] ++ pmul2 xs p (n-1)
pmul2 [] p n = []

zero :: Int -> P
zero 0 = []
zero 1 = [0]
zero n = [0] ++ zero (n-1)


peval :: P -> C -> C
peval [] _ = 0
peval a 0 = last a
peval [x] b = x
peval (a:as) b = (a * (b ^ length as)) + peval as b

pderv :: [Int] -> [Int]
pderv [] = []
pderv [a] = []
pderv (x:xs) = [x * length xs] ++ pderv xs