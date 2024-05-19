package C.JInnerClass.B;

public class LocalInner {
    public static void main(String[] args) {

         class Bonjour{
       public void bonjourTurk(){
            System.out.println("Merhab");
        }

        public void bonjourPenguin(){
           System.out.println("Penguin");
        }

        public void bonjourPersan(){
           System.out.println("salam");
        }
    }

    Bonjour bonjour = new Bonjour();
         bonjour.bonjourTurk();
         bonjour.bonjourPenguin();
         bonjour.bonjourPersan();

    }
}
