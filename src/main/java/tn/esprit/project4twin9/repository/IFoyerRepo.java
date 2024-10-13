package tn.esprit.project4twin9.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.project4twin9.entity.Foyer;

@Repository
public interface IFoyerRepo extends JpaRepository<Foyer,Long> {
    Foyer findByIdFoyer(Long idFoyer);
}
