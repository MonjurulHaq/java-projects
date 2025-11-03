
package readtextfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readfile {
    public String line;
    public void readfile1(String filename){
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found"+ filename);
        }catch(IOException e1){
            System.out.println("Can't read file"+filename);
        }catch(Exception e12){
            
        }
}
}
