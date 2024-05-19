package C.AClasses.C;


public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne();
        personne.genre="Male";
        personne.coleurYeux="blue";
        personne.coleurCheveux="noire";
        personne.taille=175;
        personne.kilo=60;

        System.out.println(personne.genre);
        System.out.println(personne.coleurYeux);
        System.out.println(personne.coleurCheveux);
        System.out.println(personne.taille);
        switch (personne.kilo) {}


        personne.manger("Pilav");
        personne.courir();
        personne.dormir();



        Personne ali=new Personne();
        ali.manger("Pilav");
        ali.courir();
        ali.dormir();

        Personne sara=new Personne();
        sara.manger("Pilav");
        sara.courir();
        sara.dormir();


    }
}
