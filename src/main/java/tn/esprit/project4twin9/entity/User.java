package tn.esprit.project4twin9.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)///i=i+1
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.UUID)
    Long idUser;
    @NonNull
    String nom;
    String prenom;
    LocalDate dateNaissance;
    //@Enumerated(EnumType.STRING)//user(1,abderahmen,benarous,1988-08-28,EMPLOYE)
      @Enumerated(EnumType.ORDINAL)//user(1,abderahmen,benarous,1988-08-28,1)
    Role role;
    @Transient
    float salaire;
    @ManyToMany
    Set<Cours> cours;

}
