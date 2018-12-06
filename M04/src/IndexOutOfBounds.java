import java.util.ArrayList;
import java.util.Scanner;

public class IndexOutOfBounds {
    public static void main(String[] args){
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i = 0; i <= 99; i++){
            testList.add((int)(Math.random()*10));
        }
        int checkIndex = 0;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter an index from 0-99: ");
        checkIndex = inputScanner.nextInt();

        int result;

        try{
            result = testList.get(checkIndex);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
    }
}
