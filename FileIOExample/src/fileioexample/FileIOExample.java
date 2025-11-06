
package fileioexample;


public class FileIOExample {

    public static void main(String[] args) {
        String fileName = "D:\\61c\\myfile.txt";
        ReadFile rf = new ReadFile();
        rf.readFileUsingReadline(fileName);
        rf.readFileUsingRead(fileName);
        rf.readFileUsingScanner(fileName);
    }
    
}
