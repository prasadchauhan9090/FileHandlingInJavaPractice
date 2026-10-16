
package FileWrittingOperations;

import java.io.*;

public class BufferedWrtiterDemo {

    public static void main(String args[]) throws IOException {

        // Step 1: Create a File object with the file path
        File file = new File("./BufferedWritterDemo.txt");

        // Step 2: Check whether the file already exists
        if (!file.exists()) {

            // Create a new file if it does not exist
            file.createNewFile();
        }

        // Step 3: Declare a String variable with the original text
        String st = "PK CHAUHAN demo on BufferedWriterDemo";

        // Step 4: Convert the original string into uppercase
        String str = st.toUpperCase();

        // Step 5: Create a BufferedWriter to write data into the file
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        // Step 6: Write the uppercase string into the file
        bw.write(str);

        // Step 7: Close the writer to flush data into the file
        bw.close();

        // Step 8: Create a BufferedReader to read data from the file
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Step 9: Declare a variable to store each line read from the file
        String lines;

        // Step 10: Read the file line by line until the end is reached
        // readLine() returns null when no more lines are available
        while ((lines = br.readLine()) != null) {

            // Step 11: Print each line on the console
            System.out.println(lines);
        }

        // Step 12: Close the reader after reading the file
        br.close();
    }
}
