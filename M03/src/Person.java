import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private String name = "John Doe";
    private String address = "1234 Whatever Drive";
    private String phoneNumber = "123-456-7890";
    private String email = "none@bugmenot.com";

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person " + this.getName();
    }
    public static void main(String[]args){
        Person testPerson=new Person();
        Person testStudent=new Student();
        Employee testEmployee=new Employee();
        Faculty testFaculty=new Faculty();
        Staff testStaff=new Staff();

        System.out.println(testPerson.toString());
        System.out.println(testStudent.toString());
        System.out.println(testEmployee.toString());
        System.out.println(testFaculty.toString());
        System.out.println(testStaff.toString());
    }
}

