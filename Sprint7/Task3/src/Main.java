import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void writeFile(String filename, String text) {

        // Write your code here
        try(FileWriter writer = new FileWriter(filename,false)){
            byte[] bytes = text.getBytes();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : bytes){
                int val = b;
                for (int i = 0;i<8;i++){
                    stringBuilder.append((val & 128) == 0 ? 0 : 1);
                    val <<=1;
                }
                stringBuilder.append(' ');
            }
            writer.write(String.valueOf(stringBuilder).replace("0",""));
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
