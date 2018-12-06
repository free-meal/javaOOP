import java.util.ArrayList;
import java.util.Scanner;

public class removeDuplicates {

    // The cheeky answer would convert the ArrayList to a HashSet
    // But I'm assuming that this is meant to use ArrayList methods.
    public static void removeDuplicate(ArrayList<Integer> list){

        ArrayList<Integer> uniqueList = new ArrayList<>();

        int i = 0;
        while (i < list.size()){
            if (!uniqueList.contains(list.get(i))){
                uniqueList.add(list.get(i));
                i++;
            }
            else {
                list.remove(i);
            }
        }
    }

    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);
        ArrayList<Integer> testDuplication = new ArrayList<>();

        System.out.print("Enter 10 integers: ");

        for (int i = 0; i < 10; i++){
            testDuplication.add(inputReader.nextInt());
        }

        removeDuplicate(testDuplication);

        System.out.print("The distinct integers are ");
        for (int i : testDuplication){
            System.out.print(i + " ");
        }
    }
}
