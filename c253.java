import java.io.*;

public class c253{
    public static void main(String[] args){
        
        String from = "Z:\\liczby.txt", to="Z:\\PPJ\\c253";
        try {
				String out = copy(from, to);
				System.out.println(out);
               
			}catch (IOException e) {
				System.out.println("Coś nie działa!");
			}
    
    }
    private static String copy(String fNameIn, String fNameOut) throws IOException {
        FileInputStream fis = new FileInputStream(fNameIn);
        FileOutputStream fos = new FileOutputStream(fNameOut);
        StringBuilder sb = new StringBuilder(); 

        int a=0;

        int b=0;
			boolean exit = false;		
			while (!exit) {	
				b = fis.read();
				if (b == -1) { 
					exit = true;	
				} else {
					sb.append((char)b);
					if(b!=32){
                        a=b;
                    }
                    System.out.println(a);
                    
					fos.write(b);
				}
			}
   
        
        fis.close();
        fos.close();
        
        return sb.toString();
    }
}