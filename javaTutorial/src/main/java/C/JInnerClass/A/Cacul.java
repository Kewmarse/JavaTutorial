package C.JInnerClass.A;

public class Cacul {

    public static double pi=3.14;

    public class Addition {
        public void addition(int a, int b) {
            System.out.println(a + b);
        }

        public void addition(int a, int b, int c) {
            System.out.println(a + b + c);
        }

    }

    public class Zone{
        public void rectangle(int longCote, int shortCote){
            System.out.println(longCote * shortCote);

        }
        public void zoneCercle(int rayon){
            System.out.println(pi*rayon*rayon);
        }

    }

}
