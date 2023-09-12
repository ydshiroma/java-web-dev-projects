import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String name;
    private HashMap<String, Integer> id;
    private ArrayList<String> keywords;
    private ArrayList<Student> students;

    public Course(String name, HashMap<String, Integer> id, ArrayList<String> keywords, ArrayList<Student> students) {
        this.name = name;
        this.id = id;
        this.keywords = keywords;
        this.students = students;
    }

    public void setName(String name) {
        name = this.name;
    }

    public String getName() {
        return name;
    }

    public void setId(HashMap<String, Integer> id) {
        id = this.id;
    }

    public HashMap<String, Integer> getId() {
        return id;
    }

    public void setKeywords(ArrayList<String> keywords) {
        keywords = this.keywords;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setStudents(ArrayList<Student> students) {
        students = this.students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
