/*
* prepared by papa_python
* */
import java.io.File;
import java.io.IOException;


public class CreateFile {
    public static void main(String[] args){
        try{
            File file1 = new File("fumbu.txt");

            if(file1.createNewFile()){
                System.out.println("file created: " + file1.getName());
            }
            else{
                System.out.println("file already exists");
            }
        }catch (IOException e){
            System.out.println("an error has occurred");
        }
    }

}
