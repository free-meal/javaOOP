import java.util.ArrayList;
import java.util.Scanner;

public class sumArrayList {

    public static double sum(ArrayList<Double> list){
        double total = 0;
        for (int i = 0; i < list.size() ; i++){
            total = total + list.get(i);
        }
        return total;
    }

    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        ArrayList<Double> testArray = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < 5; i++){
            testArray.add(inputReader.nextDouble());
        }

        System.out.println("The sum of the numbers is: " + sum(testArray));
    }
}
