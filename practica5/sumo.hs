sum_1 :: Num a => [a] -> a
sum_1 [] = 0
sum_1 (x:xs) = x + sum_1 xs

--Teniendo la lista de listas [[0,1,2],[3,4,5],[6,7,8]], hemos sumado
--Esto es lo que hay que escribir al haber entrado en el Main para que sume
--la lista de los ultimos elementos (2+5+8)
--let xxs = [[0,1,2],[3,4,5],[6,7,8]]
--let ultimo = [ last x | x<-xxs ]
--sum_1 ultimo

--Para que sume los anteriores(1,4,7) hacemos
-- let rec = [last(init x) | x<-xxs]
--sum_1 rec

--Para sumar el primer elemento de las listas, con head
-- let cabeza = [head x | x<-xxs ]
--sum_1 cabeza
