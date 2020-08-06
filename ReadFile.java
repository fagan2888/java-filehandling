/*
 * prepared by papa_python
 * */

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try {
            File file1 = new File("fumbu.txt");
            Scanner myReader = new Scanner(file1);

            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("an error has occurred");
        }

    }
}
