package FileWrittingOperations;

import java.io.*;

public class BufferedWrtiterDemo {

    public static void main(String args[]) throws IOException {

        File file = new File("./BufferedWritterDemo.txt");

        if (!file.exists())
            file.delete();
        file.createNewFile();


        //2. BufferedWritter Demo
        String st = "PK CHAUHAN demo on BufferedWriterDemo";

        String str = st.toUpperCase();

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        bw.write(str);
        bw.close();



        BufferedReader br = new BufferedReader(new FileReader(file));

        String lines;

        while((lines = br.readLine()) != null){

            System.out.println(lines);
        }








        br.close();
    }

}
