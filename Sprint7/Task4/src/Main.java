import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static String readFile(String filename) {

        // Write your code here
        try (FileReader fileReader = new FileReader(filename)){
            
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
