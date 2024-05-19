package C.DInheritance.BSuper;

public class Profersseur extends Utilisateur {

    private int rest;
    public double paun;

    public Profersseur(String userName, String password) {
        super(userName, password);
    }

    public void retirerArgent(int argent){
        this.rest -= rest-argent;

        System.out.println(this.rest);
    }



    public double getPaun() {
        return paun;
    }

    public void setPaun(double paun) {
        this.paun = paun;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }
}
