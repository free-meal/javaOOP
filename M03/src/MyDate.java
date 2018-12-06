import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year = 1970;
    private int day = 1;
    private int month = 0;

    public MyDate() {
        Calendar calendar = new GregorianCalendar().getInstance();
        this.year = calendar.YEAR;
        this.month = calendar.MONTH;
        this.day = calendar.DAY_OF_MONTH;
    }

    public MyDate(long elapsedTime) {
        Calendar calendar = new GregorianCalendar().getInstance();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.YEAR;
        this.month = calendar.MONTH;
        this.day = calendar.DAY_OF_MONTH;
    }

    public MyDate(int year, int day, int month){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }
}