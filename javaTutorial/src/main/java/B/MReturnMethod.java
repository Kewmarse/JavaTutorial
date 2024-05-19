package B;

public class MReturnMethod {

    public static double moyenne(int num1, int num2){
        int sum = num1 + num2;
        double avg = sum / 2;
        return avg;


    }

    public static void main(String[] args) {

        System.out.println(moyenne(8,10));

    }


}
