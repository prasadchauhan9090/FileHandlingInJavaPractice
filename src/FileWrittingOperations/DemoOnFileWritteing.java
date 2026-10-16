package FileWrittingOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOnFileWritteing {

    public static void main(String args[]) throws IOException

    {

        File file = new File("./FileWrittingOperations.txt");

        if(!file.exists())
            file.delete();
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(72);
        fos.write(69);
        fos.write(76);
        fos.write(76);
        fos.write(79);


        String s="Hello chauhan";
        FileInputStream fis = new FileInputStream(file);
        for(char ch : s.toCharArray())
        {
            fos.write((int)ch);
        }
        int asci;
        while ((asci = fis.read()) != -1)
        {
            System.out.print((char)asci);
        }






        fos.close();



    }

}
