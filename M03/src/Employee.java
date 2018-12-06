public class Employee extends Person {
    private int office = 0;
    private int salary = 0;
    private MyDate dateHired;

    public Employee(){
    }

    public Employee(int office, int salary, MyDate dateHired){
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public int getOffice(){
        return office;
    }

    public void setOffice(int office){
        this.office = office;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(){
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired){
        this.dateHired = dateHired;
    }

    @Override
    public String toString(){
        return "Employee " + this.getName();
    }
}