package FileReadingOperations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemoPractice {

    public static void main(String args[]) throws IOException
    {

        File file = new File("./AboutFileReader.txt");

        if(!file.exists())
        file.createNewFile();
        FileReader fr = new FileReader(file);

        int ascii;
        String text="";

        while((ascii=fr.read())!=-1)
        {
            text = text + String.valueOf((char)ascii);
        }
        System.out.print(" ");
        System.out.print(text);

        fr.close();
    }




}
