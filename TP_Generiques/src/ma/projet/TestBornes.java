package ma.projet;

import java.util.ArrayList;
import java.util.List;

public class TestBornes {

    // Accepte Personne et toutes ses sous-classes
    public static void afficherPersonnes(
            List<? extends Personne> personnes) {

        for (Personne p : personnes) {
            p.afficher();
        }
    }

    public static void main(String[] args) {

        List<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(
                new Etudiant("Alice", 20, "Informatique"));

        etudiants.add(
                new Etudiant("Sara", 22, "Mathematiques"));

        List<Enseignant> enseignants = new ArrayList<>();

        enseignants.add(
                new Enseignant("Ahmed", 40, "Java"));

        System.out.println("Liste des etudiants :");
        afficherPersonnes(etudiants);

        System.out.println("\nListe des enseignants :");
        afficherPersonnes(enseignants);
    }
}