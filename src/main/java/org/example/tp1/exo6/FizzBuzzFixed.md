il ya  un bug logique subtil dans cette ligne :

if (n <= 1) {
throw new IllegalArgumentException("n must be positive");
}

e message d’exception est trompeur :

Il indique que n doit être positif, mais le test rejette aussi n = 1, qui est positif.
correction : Corriger la condition pour rejeter seulement les valeurs négatives ou nulles (n <= 0)
