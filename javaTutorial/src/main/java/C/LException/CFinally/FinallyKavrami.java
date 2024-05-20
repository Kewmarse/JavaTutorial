package C.LException.CFinally;

public class FinallyKavrami {
    public static void main(String[] args) {
        try {
            String nom=null;
            String message=nom.toUpperCase();
            System.out.println(message);

            int div=30/0;
            System.out.println(div);
        }catch (ArithmeticException e){
            System.out.println("il ya un erreur :"+e);
        }catch (NullPointerException e){
            System.out.println("il ya un erreur :"+e);
        }

        finally {
            System.out.println("ce bloc fonction certainment ");
        }


    }
}
