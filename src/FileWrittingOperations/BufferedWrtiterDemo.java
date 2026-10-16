package FileWrittingOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrtiterDemo {

    public static void main(String args[]) throws IOException {

        File file = new File("./BufferedWritterDemo.txt");

        if (!file.exists())
            file.delete();
        file.createNewFile();


        //2. BufferedWritter Demo
        String st = "PK CHAUHAN demo on BufferedWriterDemo";

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        bw.write(st);


        bw.close();
    }

}
