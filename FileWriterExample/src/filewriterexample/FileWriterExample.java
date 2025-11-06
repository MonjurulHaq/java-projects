package filewriterexample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

public class FileWriterExample { 

    public static void main(String[] args) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter text to write into file");
            String myContent = sc.nextLine(); 

            File file = new File("D://myfile1.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            fw = new FileWriter(file,true);
            bw = new BufferedWriter(fw);
            bw.write(myContent);
            bw.newLine();
            System.out.println("Written into file");
            bw.close();
            sc.close(); 
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
