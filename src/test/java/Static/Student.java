package Static;

public class Student {
    String name;
    int rollNumber;
    static String universityName= "XYZ University";

    public Student (String name, int rollNumber){
        this.name = name;
        this.rollNumber= rollNumber;
    }
    static void changeUniversity(String newUniversity){
        universityName=newUniversity;

    }

    void displayStudentInfo(){
        System.out.println(("Student Name: " + name));
        System.out.println("Roll Number: " + rollNumber);
        System.out.println(("University: " + universityName));

    }
}