package C.BEcapsulation.F;

public class Encapsullation {
    public static void main(String[] args) {
        Utilsateur util = new Utilsateur();
        System.out.println(util.getNom());
        util.setNom("akbar");
        System.out.println(util.getNom());

        util.setAge(555);
        System.out.println(util.getAge());

    }
}
