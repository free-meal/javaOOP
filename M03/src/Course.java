import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    // more complicated get method
    // in order to keep the contract
    // and return an array of strings
    public String[] getStudents(){
        String[] studentArray = new String[students.size()];
        for (int i = 0; i < students.size(); i++){
            studentArray[i] = students.get(i);
        }
        return studentArray;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        students.remove(student);
    }
}
