package ma.projet;

public class Personne {

    protected String nom;
    protected int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void afficher() {
        System.out.println("Nom : " + nom
                + ", Age : " + age);
    }
}