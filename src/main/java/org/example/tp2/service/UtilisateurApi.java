package org.example.tp2.service;

import org.example.tp2.service.Utilisateur;

public interface UtilisateurApi {
    void creerUtilisateur(Utilisateur utilisateur) throws ServiceException;
}