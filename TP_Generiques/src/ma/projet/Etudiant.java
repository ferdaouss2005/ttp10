package ma.projet;

public class Etudiant extends Personne {

    private String filiere;

    public Etudiant(String nom, int age, String filiere) {
        super(nom, age);
        this.filiere = filiere;
    }

    @Override
    public void afficher() {
        System.out.println("Etudiant : " + nom
                + ", Age : " + age
                + ", Filiere : " + filiere);
    }
}
