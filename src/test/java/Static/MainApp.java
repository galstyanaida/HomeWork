package Static;

public class MainApp {
    public static void main(String [] args){
        Student student1 = new Student("Aida", 23263);
        student1.displayStudentInfo();
        Student.changeUniversity("Harward University");
        System.out.println("Updated: ");
        student1.displayStudentInfo();
    }
}
