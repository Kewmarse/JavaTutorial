package C.DInheritance.EAnimalsOverriding;

public class Mouton extends Animal {
    private String couleur;
    public void recadrer(){
        System.out.println("en traine de recadrer ");
    }

    @Override
    public void nourriture() {
        System.out.println("manger de herbe");
    }
}
