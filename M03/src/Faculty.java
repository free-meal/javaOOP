public class Faculty extends Employee {
    private String officeHours = "9 to 5";
    private String rank = "Junior Adjunct";

    public Faculty(){
    }

    public Faculty(String officeHours, String rank){
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours(){
        return officeHours;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public String getRank(){
        return rank;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Faculty " + this.getName();
    }
}