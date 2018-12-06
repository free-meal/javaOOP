public class Staff extends Employee {
    private String title = "Professor";

    public Staff(){
    }

    public Staff(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return "Staff " + this.getName();
    }
}