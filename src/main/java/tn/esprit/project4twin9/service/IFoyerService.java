package tn.esprit.project4twin9.service;

import tn.esprit.project4twin9.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer ajouterFoyer(Foyer foyer);
    Foyer modifierFoyer(Foyer foyer);
    Foyer modifierFoyerParId(long idFoyer);
    List<Foyer> affichertout();
    Foyer chercherFoyerParId(long idFoyer);
    Boolean supprimerFoyer(Foyer foyer);
    Boolean supprimerFoyerParId(long idFoyer);
}
