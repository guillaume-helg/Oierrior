public class Case {
    private int numCase;

    public Case(int numCase) {
        this.numCase = numCase;
    }

    public String getNom() {
        return " numero " + this.numCase;
    }

    public int getNum() {
        return this.numCase;
    }

    public Case depart(Oie oie) {
        oie.getCouleur();
        this.getNom();
        oie.ajouterMessage("L'oie " + oie.getCouleur() + " est sur la case " + this.numCase);
        suivante(oie, oie.lancerDe() + this.numCase - 1);
        return this.suivante(oie, this.numCase);
    }

    public Case arrivee(Oie oie) {
        oie.ajouterMessage("Je suis arrivé à " + this.numCase + " ");
        return this;
    }

    protected Case suivante(Oie oie, int numCaseDestination) {
        String arr = this.arrivee(oie).getNom();
        oie.ajouterMessage("Elle va sur la case " + arr);
        return oie.getPlateau().donnerCase(numCaseDestination);
    }
}
