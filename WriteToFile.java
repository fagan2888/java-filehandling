/*
 * prepared by papa_python
 * */

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args){
        try {
            FileWriter myWriter = new FileWriter("fumbu.txt");
            myWriter.write("i love to program");
            myWriter.close();
            System.out.println("successfully creation of a file");
        }catch (IOException e){
            System.out.println("an error has occurred");
        }
    }
}
