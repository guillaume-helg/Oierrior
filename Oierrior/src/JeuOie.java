import java.util.ArrayList;

public class JeuOie {
    private int nbOie = 0;
    private ArrayList<Oie> oies;
    private Plateau plateau;
    private De de;

    public JeuOie(int oieMax) {
        this.nbOie = oieMax;
        this.oies = new ArrayList<Oie>();
    }

    public void ajouterOie(Couleur couleur) {
        this.oies.add(new Oie(couleur, this.plateau, this.de));
    }

    public void jouer() {
        boolean start = nbOie < 2;
        boolean finpartie = false;
        while (!start && !finpartie) {
            for (Oie oie : oies) {
                finpartie = oie.action();
            }
        }
    }
}
