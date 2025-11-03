package readtextfile;

import java.io.*;


public class ReadTextFile {

    public static void main(String[] args) {
        //the name and location of the file to open
       
        String filename = "D:\\New folder\\myFile.txt";
        readfile ob = new readfile();
        ob.readfile1(filename);
    }
    
}
