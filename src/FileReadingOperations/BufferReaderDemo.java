package FileReadingOperations;

import java.io.*;

public class BufferReaderDemo {

    public static void main(String args[]) throws IOException {

        File file = new File("./BufferReader.txt");

        if (!file.exists())
            file.createNewFile();



        int asciiCode;

//        String text = new String();
//        while ((asciiCode = br.read()) != -1) {
//            text = text + String.valueOf((char) asciiCode);
//            System.out.print((char)asciiCode);
//        }
//
//        System.out.print(text);

//
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(isr);


       String text = new String();
       String line = new String();
       while((line = br.readLine())!=null)
       {
          text = text + line + "\n";
       }

       System.out.println(text);

       fis.close();
       isr.close();
       fr.close();
       br.close();



    }
}
