package C.LException.B;

public class ExceptionEx {
    public static void main(String[] args) {

        int [] num = {1,2,3,4,5};
        try {

            int div=30/0;

            int eleman=num[5];
            System.out.println(eleman);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("il ya un erreur de ArrayIndexOutOfBoundsException...");
        }catch (ArithmeticException e){
            System.out.println("il ya un erreur de ArithmeticException...");
        }catch (Exception e){
            System.out.println("il ya un erreur de general Exception...");
        }

        System.out.println("ici marche");

    }
}
