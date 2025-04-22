package org.example.tp2.service;

public class UserService {

    private final UtilisateurApi utilisateurApi;

    public UserService(UtilisateurApi utilisateurApi) {
        this.utilisateurApi = utilisateurApi;
    }

    // La méthode à tester
    public void creerUtilisateur(Utilisateur utilisateur) throws ServiceException {
        utilisateurApi.creerUtilisateur(utilisateur);
    }
}
