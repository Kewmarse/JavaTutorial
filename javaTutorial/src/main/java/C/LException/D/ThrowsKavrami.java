package C.LException.D;

public class ThrowsKavrami {

    public static void ageControl(int age){
        if(age < 18){
            throw new ArithmeticException();
        }else{
            System.out.println("vous etes en legal age "+age);
        }
    }
    public static void main(String[] args) {

        ageControl(16);
    }
}
