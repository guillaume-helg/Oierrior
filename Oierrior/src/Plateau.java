import java.util.ArrayList;

public class Plateau {

    private static final int NB_CASES = 63;
    private ArrayList<Case> cases;
    public Plateau() {
        for (int i = 0; i < cases.size()-1; i++) {
            cases.set(i, new Case(i));
        }
    }

    private void initialisationCasesSpecifique() {

    }

    public Case donnerCase(int numCase) {
        return cases.get(numCase);
    }

    public Case caseDebutPartie() {
        return cases.get(0);
    }
}
