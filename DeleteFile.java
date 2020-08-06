/*
 * prepared by papa_python
 * */
import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        File file1 = new File("fumbu.txt");

        if (file1.delete()){
            System.out.println("the file deleted: " + file1.getName());
        }
        else{
            System.out.println("failed to delete a file");
        }
    }
}
