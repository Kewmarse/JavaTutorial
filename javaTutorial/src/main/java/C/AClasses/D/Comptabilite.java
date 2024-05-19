package C.AClasses.D;

public class Comptabilite {
    public int resultat=0;

    public String nom="Kewmarse RAHMANI";

    public void argentAjouter(int argent){
        resultat=resultat+argent;
        System.out.println("argentAjouter: "+resultat);
    }
    public void argenRecu(int argent){
        resultat=resultat-argent;
        System.out.println("argenRecu: "+resultat);
    }

    public void argenTotal(){
        System.out.println(resultat);
    }





}
