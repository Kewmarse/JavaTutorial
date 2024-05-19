package B;

public class OOverloading {

    public static void moyen(int num1, int num2) {
        double sum = num1 + num2;
        double moyen = sum / 2;
        System.out.println(moyen);
    }


    public static void moyen(int num1, int num2,int num3) {
        double sum = num1 + num2+num3;
        double moyen = sum / 3;
        System.out.println(moyen);
    }




    public static void main(String[] args) {

        moyen(4,5);
        moyen(4,5,6);


    }

}
