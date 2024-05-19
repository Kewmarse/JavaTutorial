package C.JInnerClass.A;

public class InnerMain {
    public static void main(String[] args) {
        Cacul.Addition add=new Cacul().new Addition();
        add.addition(5,4);
    }
}
