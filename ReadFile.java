import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(new FileInputStream("lubiejave.txt"))) {
            int count = 0;
            while (sc.hasNext()){
                sc.next();
                count++;
            }
            File myFile = new File("lubiejave.txt");
            Scanner myReader = new Scanner(myFile);
                System.out.println("number of words: "+ count);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
