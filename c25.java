import java.io.*;

public class c25{
    public static void main(String[] args){
        
        String from = "Z:\\plik.txt", to="Z:\\PPJ\\c25";
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

        int b=0;
        while((b = fis.read()) != -1){
            sb.append((char)b);
            fos.write(b);

            }
        
        fis.close();
        fos.close();
        
        return sb.toString();
    }
}