package arraylistfromfile;

import java.io.*;
import java.util.*;

public class ArrayListFromFile {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("E:\\name.txt");
            br = new BufferedReader(fr);
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception ee) {

            }

        }
        for (String s : list) {
            System.out.println(s);
        }
        //search
        Scanner s= new Scanner(System.in);
        System.out.println("Enter first character");
        String ch=s.nextLine();
        System.out.println("Name starts with "+ch);
        for (String s1 : list) {
            if(s1.startsWith(ch)){
                System.out.println(s1);
            }
        }
    }

}
