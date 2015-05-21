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

multTupla :: P -> T -> P
multTupla p (0,_) = []
multTupla [] t = []
multTupla p t = [(fst (head p) * fst t, snd (head p) + snd t)] ++ multTupla (tail p) t


multPol :: P -> P -> P
multPol [] p = []
multPol p [] = p
multPol p q = padd ([multTupla q (head p)] ++ [multPol (tail p) q])

pmul :: LP -> P
pmul [] = []
pmul l = multPol (head l) (pmul (tail l))

peval :: P -> Double -> Double
peval [] _ = 0
peval p 0 = fst (last p)
peval (p:ps) n = ((fst p)*(n ** fromIntegral((snd p)))) + (peval ps n)

pderv  :: P -> P
pderv [] = []
pderv [(_,0)] = []
pderv (p:ps) = [((fst p) * fromIntegral((snd p)),(snd p)-1)] ++ pderv (ps)
