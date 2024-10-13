package tn.esprit.project4twin9.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.project4twin9.entity.Foyer;
import tn.esprit.project4twin9.repository.IFoyerRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService{
    IFoyerRepo foyerRepo;

    @Override
    public Foyer ajouterFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer modifierFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer modifierFoyerParId(long idFoyer ) {
        return foyerRepo.findById(idFoyer).orElse(null);
    }

    @Override
    public List<Foyer> affichertout() {
        return foyerRepo.findAll();
    }

    @Override
    public Foyer chercherFoyerParId(long idFoyer) {
        return foyerRepo.findByIdFoyer(idFoyer);
    }

    @Override
    public Boolean supprimerFoyer(Foyer foyer) {
        this.foyerRepo.delete(foyer);
        return true;
    }

    @Override
    public Boolean supprimerFoyerParId(long idFoyer) {
        this.foyerRepo.deleteById(idFoyer);
        return true;
    }
}
