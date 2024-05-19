package C.IStaticFinal.AStatic;

public class Voiture {
    public String model;
    public String couleur;
    public int power;

    public static int surum=10;

    public Voiture(){
        surum+=10;
    }

    public static void ouvreClima(){
        System.out.println("clima est ouverir");
    }
    public static void ouvrePort(){
        System.out.println("porta est ouverir");
    }






}
