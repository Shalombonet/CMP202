package User;

public class Student extends User {
    String matric_no = "BHU/22/04/05/0012";
    String admission_no = "171414141";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register at this moment, ";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result.";
        } else {
            return "You got 5A's 4B's and 6C's";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Shallom Bonet";
        student.password = "Shallom1234$";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}