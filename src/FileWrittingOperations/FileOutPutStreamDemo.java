package FileWrittingOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo {


    public static void main(String args[]) throws IOException
    {

        File file = new File("./sampleTextOnFileoutPutStream.txt");

        if(!file.exists())
            file.delete();
        file.createNewFile();

        String s="PRASAD CHAUHAN K";

        FileOutputStream fos = new  FileOutputStream(file);

        for(char ch : s.toCharArray())
        {
            fos.write(ch);
        }

//       fos.write(74);
//       fos.write(75);
//       fos.write(87);
//        fos.write(94);
//        fos.write(95);
//        fos.write(82);

        fos.flush();



        fos.close();



    }
}
