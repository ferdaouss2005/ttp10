package ma.projet;

public class Enseignant extends Personne {

    private String specialite;

    public Enseignant(String nom, int age, String specialite) {
        super(nom, age);
        this.specialite = specialite;
    }

    @Override
    public void afficher() {
        System.out.println("Enseignant : " + nom
                + ", Age : " + age
                + ", Specialite : " + specialite);
    }
}
