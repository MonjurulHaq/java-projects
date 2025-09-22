package datatypeexample;

public class dataTypeMaxMinValue {
    public void printLimit(){
        System.out.println("Min value of byte: "+ Byte.MIN_VALUE);
        System.out.println("Max value of byte: "+ Byte.MAX_VALUE);
        System.out.println("------------------------------");
        
        System.out.println("Min value of short: "+ Short.MIN_VALUE);
        System.out.println("Max value of short: "+ Short.MAX_VALUE);
        System.out.println("------------------------------");
        
        System.out.println("Min value of int: "+ Integer.MIN_VALUE);
        System.out.println("Max value of int: "+ Integer.MAX_VALUE);
        System.out.println("------------------------------");
        
        System.out.println("Min value of float: "+ Float.MIN_VALUE);
        System.out.println("Max value of float: "+ Float.MAX_VALUE);
        System.out.println("------------------------------");
        
        System.out.println("Min value of long: "+ Long.MIN_VALUE);
        System.out.println("Max value of long: "+ Long.MAX_VALUE);
        System.out.println("------------------------------");
        
        System.out.println("Min value of double: "+ Double.MIN_VALUE);
        System.out.println("Max value of double: "+ Double.MAX_VALUE);
        System.out.println("");
    }
    
    public void printSize(){
        System.out.println("Size of byte data type: "+ Byte.SIZE+ "bits");
        System.out.println("Size of short data type: "+ Short.SIZE+ "bits");
        System.out.println("Size of int data type: "+ Integer.SIZE+ "bits");
        System.out.println("Size of long data type: "+ Long.SIZE+ "bits");
        System.out.println("Size of float data type: "+ Float.SIZE+ "bits");
        System.out.println("Size of double data type: "+ Double.SIZE+ "bits");
        System.out.println("Size of char data type: "+ Character.SIZE+ "bits");
    }
}
