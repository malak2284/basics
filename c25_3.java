import java.io.*;

public class c253{
    public static void main(String[] args){

        String from = "Z\\liczby.txt";
        String to = "Z\\PPJ\\c253";
        
        try {
            String out = copy(from, to);
            System.out.println(out);
        } catch(IOException e){
            System.out.println("coś nie działa");
        }


    }
    private static String copy(String fNameIn, String fNameOut) throws IOException{

    FileInputStream fis = new FileInputStream(fNameIn);
    FileOutputStream fos = new FileOutputStream(fNameOut);
    StringBuilder sb = new StringBuilder();

    int b=0;

    boolean exit = false;
    while(!exit){
        b=fis.read();
        if (b==-1){
            exit = true;
        } else {
            sb.append((char) b);
            System.out.println((char) b );
            fos.write(b);
        }
    }

    fis.close();
    fos.close();

    return sb.toString();
    }
}