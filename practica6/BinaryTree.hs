-- Autor: Ana Roig y Alejandro Solanas
-- Nips: 686329 / 647647
-- Fecha: 26/5/2015
-- Fichero: BinaryTree.hs

module BinaryTree where

	--Dato Tree
	data Tree x = Empty | Node x (Tree x) (Tree x)

	empty :: Tree x
	empty = Empty

	leaf :: x -> Tree x
	leaf x = Node x Empty Empty

	tree :: x -> Tree x -> Tree x -> Tree x
	tree x lb rb = Node x lb rb

	size :: Tree x -> Int
	size Empty = 0
	size (Node x lb rb) = 1 + (size lb) + (size rb)

	instance (Show t) => Show (Tree t) where
		show Empty = ""
		show (Node x lb rb) = " " ++ (show x) ++ "\n"
													++ (show lb) ++ "  "
													++ (show rb) ++ "\n"

	preorder :: (Ord x) => Tree x -> [x]
	preorder Empty = []
	preorder (Node x lb rb) = [x] ++ preorder lb ++ preorder rb

	postorder :: (Ord x) => Tree x -> [x]
	postorder Empty = []
	postorder (Node x lb rb) = postorder lb ++ postorder rb ++ [x]

	inorder :: (Ord x) => Tree x -> [x]
	inorder Empty = []
	inorder (Node x lb rb) = inorder lb ++ [x] ++ inorder rb

	add :: (Ord x) => Tree x -> x -> Tree x
	add Empty x = leaf x
	add tr@(Node t lb rb) x
		| (x>t)= Node t lb (add rb x)
		| (x<t)= Node t (add lb x) rb
	  | otherwise = tr

	between :: (Ord x) => Tree x -> x -> x -> [x]
	between Empty _ _ = []
	between (Node x lb rb) min max | (x>=min && x<=max) = (between lb min max) ++ [x] ++ (between rb min max)
	between (Node x lb rb) min max | (x<min) = between rb min max
	between (Node x lb rb) min max | (x>max) = between lb min max
