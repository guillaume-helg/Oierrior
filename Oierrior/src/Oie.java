public class Oie {
    private Case casePlateau;
    private Couleur couleur;
    private Journal journal;
    private Plateau plateau;
    private De de;
    public Oie(Couleur couleur, Plateau plateau, De de) {
        this.couleur = couleur;
        this.plateau = plateau;
        this.casePlateau = this.plateau.caseDebutPartie();
        this.de = de;
    }

    public boolean action() {
        casePlateau.depart(this);
        return casePlateau.equals(63);
    }

    public int lancerDe() {
        return this.de.lancer();
    }

    public Plateau getPlateau() {
        return this.plateau;
    }

    public Couleur getCouleur() {
        return this.couleur;
    }

    public void ajouterMessage(String message) {
        this.journal.ajouterMessage(message);
    }
}
