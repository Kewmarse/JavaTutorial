package C.DInheritance.EAnimalsOverriding;


public class Cheval extends Animal {

    private int tailleJambes;
    private int vitesse;


    public void changeDeFer(){
        System.out.println("changer de fer de cheval");
    }
    public void donneFormation(){
        System.out.println("formation a ete donne ");
    }

    @Override
    public void nourriture() {
        System.out.println("mange de avoine ");

    }



}
