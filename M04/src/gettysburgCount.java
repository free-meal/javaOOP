import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class gettysburgCount {
        public static void main(String[] args) throws Exception{
            int wordCount = 0;
            try {
                URL gettysburgAddress = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");
                Scanner input = new Scanner(gettysburgAddress.openStream());
                while (input.hasNext()){
                    // remove "-- " from file stream to avoid counting as words
                    String line = input.nextLine().replaceAll("-- ", "");
                    System.out.println(line);
                    if (!line.equals("")){
                        wordCount += line.split(" ").length;
                    }
                }
                System.out.println("There are " + wordCount + " words in the Gettysburg Address file");
                
            }catch (MalformedURLException ex){
                    ex.printStackTrace();
            }
        }
}
