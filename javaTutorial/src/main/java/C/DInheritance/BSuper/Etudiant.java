package C.DInheritance.BSuper;

public class Etudiant extends Utilisateur {

    private String numberCourse;

    public Etudiant(String numberCourse,String userName, String password) {
        super(userName, password);
        this.numberCourse=numberCourse;
    }

    public void paun(){
        System.out.println("il pris le paun");
    }


    public String getNumberCourse() {
        return numberCourse;
    }

    public void setNumberCourse(String numberCourse) {
        this.numberCourse = numberCourse;
    }
}
