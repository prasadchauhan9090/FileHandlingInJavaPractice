package FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program2 {


    public static void main(String args[]) throws IOException {

        File fs = new File("./AboutFile.txt");

        if(!fs.exists())

            fs.createNewFile();

        FileInputStream fls = new FileInputStream(fs);

        int Ascii;

        while((Ascii = fls.read())!=-1)
        {
            System.out.print((char)Ascii);
        }




    }
}