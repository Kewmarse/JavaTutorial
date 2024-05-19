package C.HInterfacePlanlama.A;

public class Etudiant implements IUtilisateur {


    @Override
    public void seConnecter(String user, String pass) {
        System.out.println("Etudiant connecter"+user+" "+pass);
    }

    @Override
    public void enregitre() {
        System.out.println("Etudiant enregitre");
    }

    @Override
    public void envoyerMessage() {
        System.out.println("Etudiant envoyerMessage");
    }
}
