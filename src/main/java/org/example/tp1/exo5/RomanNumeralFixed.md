le bug logique se trouve dans cette ligne : for (int i = 0; i <= symbols.length; i++) {
La condition i <= symbols.length est incorrecte. Les indices valides d’un tableau vont de 0 à symbols.length - 1 , donc symbols.length dépasse les bornes et cela va provoquer une ArrayIndexOutOfBoundsException à l'exécution lorsque i == symbols.length.

La correction est : for (int i = 0; i < symbols.length; i++) {
