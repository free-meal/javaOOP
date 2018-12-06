public class Student extends Person {
    final String STATUS = "Freshman";

    public Student(){
    }

    public Student(String status){
        final String STATUS = status;
    }

    public String getSTATUS() {
        return STATUS;
    }

    @Override
    public String toString(){
        return "Student " + this.getName();
    }
}
