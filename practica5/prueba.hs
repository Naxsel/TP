type T = (Double,Integer)
type P = ([T])
type LP = ([P])


peval :: P -> Double -> Double
peval [] _ = 0
peval p 0 = fst (last p)
peval (p:ps) n = ((fst p)*(n ** fromIntegral((snd p)))) + (peval ps n)peval :: P -> Double -> Double
peval [] _ = 0
peval p 0 = fst (last p)
peval (p:ps) n = ((fst p)*(n ** fromIntegral((snd p)))) + (peval ps n)type T = (Double,Integer)
