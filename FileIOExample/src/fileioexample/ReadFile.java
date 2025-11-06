
package fileioexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public void readFileUsingReadline(String fileName){
        BufferedReader br = null;
        FileReader fr = null;
        try{
            fr= new FileReader(fileName);
            br= new BufferedReader(fr);
            System.out.println("Read file using readline() method");
            String line;
            while((line=br.readLine())!=null){
            System.out.println(line);
        }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally{
        try{
            if(br!=null)
            br.close();
        }catch(IOException ie){
            System.out.println("Error closing file");
        }
        
    }
    }
    public void readFileUsingRead(String fileName){
    BufferedReader br = null;
        FileReader fr = null;
        try{
            fr= new FileReader(fileName);
            br= new BufferedReader(fr);
            System.out.println("Read file using read() method");
            int num = 0;
            char ch;
            while((num=br.read())!=-1){
                ch=(char)num;
            System.out.print(ch);
        }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally{
        try{
            if(br!=null)
            br.close();
        }catch(IOException ie){
            System.out.println("Error closing file");
        }
        
    }
}
    public void readFileUsingScanner(String fileName){
        try{
            System.out.println("\nRead file using Scanner class");
            File file = new File(fileName);
            Scanner s = new Scanner(file);
            while(s.hasNextLine()){
                System.out.println(s.nextLine());
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public 
}
