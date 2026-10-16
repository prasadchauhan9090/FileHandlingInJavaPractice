package FileWrittingOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterInJava {

    public static void main(String args[]) throws IOException
    {
        File file = new File("./FileWritterDemo.txt");

        if(!file.exists())
            file.delete();
        file.createNewFile();


        //2. FileWritter Demo

        String st = "PK CHAUHAN";
        FileWriter fw = new FileWriter(file);
        fw.write(st);
        fw.close();




    }
}
