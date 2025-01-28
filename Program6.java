public class Program6{
    public static void main(String [] args){

       
        
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
		
        /*
        int num = scanner.nextInt();
       
        
        
        
           // Zad.1
        
        for (int i=0; num>(2*i+1)*(2*i+1); i++){ 
            System.out.println((2*i+1)*(2*i+1));
            
        }
        */


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double x=(Math.floor(Math.random()*100+1));
        
     
        
         while (a<x && x<b){
            System.out.println( "Wylosowana liczba to" +x+ ", nie znajduje się ona w przedziale [" +a+ "," +b+ "]");
            x++;
        }
        
        



       


        
        

        

        

        





       
        
        

        
        
        
        

         


        

        
    }
}