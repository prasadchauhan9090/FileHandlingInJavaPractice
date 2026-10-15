package FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFilePracticeFileInputStreamReader {



    public static void main(String args[]) throws IOException {

        File file = new File("./sample.txt");

        if (!file.exists())
            file.createNewFile();
        //file.delete();

        //READING ALL INPUTS FROM THE GIVEN SAMPLE.TXT
        FileInputStream fis = new FileInputStream(file);

        int asciiCode;

        String text = new String();
        while ((asciiCode = fis.read()) != -1) {
            text = text + String.valueOf((char) asciiCode);
            System.out.print((char)asciiCode);

        }
        System.out.println("PRINTING: ");
        System.out.print(text);

        System.out.println("============================================");





        fis.close();



    }
}
