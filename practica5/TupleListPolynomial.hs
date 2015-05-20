module TupleListPolynomial where

type T = (Double,Integer)
type P = ([T])
type LP = ([P])

coef :: Double  -> T
coef x = (x,0)

padd :: LP -> P
padd [] = []
padd l = (padd1 (head l) (tail l))

padd1 :: P -> LP -> P
padd1 p [] = p
padd1 p (x:xs) = padd1 (padd2 p x ) xs


padd2 :: P -> P -> P
padd2 p [] = p
padd2 p (x:xs) = padd2 (padd3 p x ) xs


padd3 :: P -> T -> P
padd3 [] t = [t]
padd3 p t = if (snd t) > (snd (head p)) then [t] ++ p
       else if (snd (head p)) == (snd t) then [(fst (head p) + fst t , snd t)] ++ tail p
       else [(head p)] ++ (padd3(tail p) t)

pmul :: LP -> P
pmul [] = []
pmul l = pmul1 (head l) (tail l)

pmul1 :: P -> LP -> P
pmul1 p [] = p
pmul1 p (x:xs) = pmul1 (pmul2 p x ) xs

pmul2 :: P -> P -> P
pmul2 p [] = p
pmul2 p (x:xs) = pmul2 (padd (pmul3 p x)) xs

pmul3 :: P -> T -> LP
pmul3 [] _ = []
pmul3 (p:ps) t = [[(fst p * fst t , snd p + snd t )]] ++ pmul3 ps t

peval :: P -> Double -> Double
peval [] _ = 0
peval p 0 = fst (last p)
peval (p:ps) n = ((fst p)*(n ** fromIntegral((snd p)))) + (peval ps n)

pderv  :: P -> P
pderv [] = []
pderv [(_,0)] = []
pderv (p:ps) = [((fst p) * fromIntegral((snd p)),(snd p)-1)] ++ pderv (ps)
