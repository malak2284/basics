public class Program7{
    public static void main(String[] args){
       // (!(a<b) && !(a>b)) to jest to samo co a==b - Zad.1

    
        int wrt=-2;   // Zad. 2
        if((wrt<=-10 && wrt>-13) || (wrt<0 && wrt>-3) || (wrt>5 && wrt<10)){
            System.out.println("A");
        } else if (wrt<-3 && wrt >-4){
            System.out.println("ABC");
        } else if (wrt<=-13 || wrt<-4 && wrt>-5){
            System.out.println("AB");
        } else if (wrt<-5 && wrt>-8){
            System.out.println("B");
        } else if (wrt>-3){
            System.out.println("C");
        }


        int x=30;   // Zad.3
        int y=60;
        int z=90;

        if (x+y+z==180){
            System.out.println("trójkąt istnieje");
        
            if (x<90 || y<90 ||z<90 ) {
            System.out.println("trójkąt jest ostrokątny");
            } else {
            System.out.println("trójkąt nie jest ostrokątny");
            }
        }
        else {
            System.out.println("trójkąt nie może istnieć");
        }
        
        
        java.util.Scanner scanner=new java.util.Scanner(System.in) ;
        char ch=scanner.next() .charAt(0) ;

        
        if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='y' || ch =='ą' || ch =='ę') {
            System.out.println("jest samogłoską");
        } else {
            System.out.println("jest spółgłoską");
        }
      


      
		int mies = scanner.nextInt();
		int rok = scanner.nextInt();
       
       if (mies==1 || mies== 3 || mies==5 || mies==7 || mies==8 || mies==10 || mies==12){
        System.out.println("31");
       }
       
            else if (mies==2 && ((rok%4==0 && rok%100 != 0)|| (rok %400 == 0))){
            System.out.println("29");
        } else {
            System.out.println("28");
        }
       
        else {
        System.out.println("30");
       }
       
       
    

       
        



            

        






        

        
    }
}