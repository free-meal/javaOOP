import java.util.Scanner;

public class FileContentCount {
        public static void main(String[] args) throws Exception{
            if (args.length != 1){
                System.out.println("Usage: java FileContentCount /path/to/file");
                System.exit(1);
            }

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            java.io.File inputFile = new java.io.File(args[0]);

            Scanner input = new Scanner(inputFile);

            while (input.hasNext()){
                String line = input.nextLine();
                if (!line.equals("")) {
                    String noSpaces = line.replaceAll("\\s+", "");
                    charCount += noSpaces.length();
                    wordCount += line.split(" ").length;
                }
                ++lineCount;
            }
            System.out.println("File " + args[0] + "has");
            System.out.println(charCount + " characters");
            System.out.println(wordCount + " words");
            System.out.println(lineCount + " lines");
        }
}
