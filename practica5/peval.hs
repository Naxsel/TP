peval :: [Int] -> Int -> Int
peval [] _ = 0
peval a 0 = last a
peval [x] b = x
peval (a:as) b = (a * (b ^ length as)) + peval as b
--peval (a:as) b = foldr (+) (b * peval as b) [a]
