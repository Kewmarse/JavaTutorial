package C.DInheritance.EAnimalsOverriding;

public class Chien extends Animal {

    public void marcher(){
        System.out.println("en traine de marcher ");
    }
    public void donneFormation(){
        System.out.println("en traine de donneFormation");
    }

    @Override
    public void nourriture() {
        System.out.println("manger de viande ");
    }
}
