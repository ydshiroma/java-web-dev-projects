import java.util.ArrayList;
import java.util.HashMap;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student Yumi = new Student("Yumi", 9999, 1, 4.0);
        System.out.println(Yumi);
        System.out.println(Yumi.getStudentId());
        System.out.println(Yumi.getGpa());
        Yumi.setGpa(5.0);
        System.out.println(Yumi.getGpa());
        Yumi.setName("Yumi Shiroma");
        System.out.println(Yumi.getName());

        Student Signora = new Student("Signora Neroni", 1111, 18, 3.99);
        HashMap<String, Integer> id = new HashMap<>();
        id.put("ENGL", 301);

        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("postcolonial theory");
        keywords.add("Marxism");

        ArrayList<Student> students = new ArrayList<>();
        students.add(Yumi);
        students.add(Signora);

        Course postcolonialTheory = new Course("Postcolonial Theory", id, keywords, students);

        System.out.println(postcolonialTheory.getName());
        System.out.println(postcolonialTheory.getKeywords());
        System.out.println(postcolonialTheory.getStudents());
//        need: HashMap with course ID (string and number), ArrayList keywords, ArrayList students
    }
}
