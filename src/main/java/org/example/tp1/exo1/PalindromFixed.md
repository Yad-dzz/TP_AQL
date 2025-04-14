Dans la méthode isPalindrome, les indices i et j sont mis à jour de manière incorrecte dans la boucle while :

j++ devrait être j-- (décrémenter pour aller vers le début de la chaîne).

i-- devrait être i++ (incrémenter pour aller vers la fin).