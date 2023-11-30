public class Journal {
    private String message;

    public void ajouterMessage(String message) {
        this.message += "\n" + message;
    }

    public void afficherMessage() {
        System.out.println(this.message);
        this.message = "";
    }
}
