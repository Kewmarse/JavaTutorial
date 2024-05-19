package C.DInheritance.AIheritence;

public class Profersseur extends Utilisateur{

    private int rest;
    public double paun;

    public void retirerArgent(int argent){
        this.rest -= rest-argent;

        System.out.println(this.rest);
    }



}
