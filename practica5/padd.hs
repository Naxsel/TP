grandes :: [Int] -> [Int] -> [Int]
grandes g p = if length g > length p then
				take (length g - length p) g
			else if length g < length p then
				take (length p - length g) p
			else []
				
dif :: [Int] -> [Int] -> Int
dif g p = if length g > length p then
			(length g - length p)
		else if length g < length p then
			(length p - length g)
		else 0


mayor :: [Int] -> [Int] -> [Int]
mayor g p = if length g >= length p then g
			else p
			
menor :: [Int] -> [Int] -> [Int]
menor g p = if length g < length p then g
			else p			
			

padd :: [[Int]] -> [Int]
padd [] = []
padd l  = paddaux (head l) (tail l) 


paddaux :: [Int] -> [[Int]] -> [Int]
paddaux p (x:xs) = paddaux (grandes x p ++ (zipWith (+) (drop (dif x p) (mayor x p)) (menor x p))) xs
paddaux p [] = p

--paddaux p (x:xs) = grandes x p ++ (zipWith (+) (drop (dif x p) (mayor x p)) (menor x p))

--Esto funciona
--grandes [10,9,8,7,6,5,4] [3,2,1] ++ zipWith (+) (drop (dif [10,9,8,7,6,5,4] [3,2,1]) [10,9,8,7,6,5,4]) [3,2,1]
--[10,9,8,7,9,7,5]
