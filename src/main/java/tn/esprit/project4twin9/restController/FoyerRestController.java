package tn.esprit.project4twin9.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.project4twin9.entity.Foyer;
import tn.esprit.project4twin9.service.IFoyerService;

@RestController
@AllArgsConstructor
//@RequestMapping("/foyer-rest")
public class FoyerRestController {
    IFoyerService foyerService;
    @PostMapping(path = "/foyer")
    public Foyer ajouterFoyer(@RequestBody Foyer foyer) { //request body bch ya9ra m json
        return foyerService.ajouterFoyer(foyer);
    }
    @PostMapping(path="/modifierfoyer")
    public  Foyer modifierFoyer(@RequestBody Foyer foyer) {
        return foyerService.modifierFoyer(foyer);
    }
    @PostMapping(path = "/modifierfoyerbyid")
    public Foyer modifierFoyerById(@PathVariable Long foyerId) {
        return  foyerService.modifierFoyerParId(foyerId);
    }
    @GetMapping(path ="/chercherfoyer/{foyerId}")
    public Foyer chercherFoyer(@PathVariable Long foyerId) {
        return  foyerService.chercherFoyerParId(foyerId);
    }
    @PostMapping("/supprimerfoyer")
    public Foyer supprimerFoyer(@RequestBody Foyer foyer) {
        this.foyerService.supprimerFoyer(foyer);
        return foyer;
    }
    @PostMapping("/supprimerfoyerbyid")
    public Foyer supprimerFoyerById(@RequestBody Foyer foyer) {
        this.foyerService.supprimerFoyer(foyer);
        return foyer;
    }
}
