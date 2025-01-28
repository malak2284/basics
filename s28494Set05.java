import java.util.Scanner;


public class s28494Set05{

    public void task01(){
        int K= 987;
        String s="";
        while(K!=  0)  {
            int cyfra=K% 10;
            s=s+cyfra;
            K=K/  10;
        }
        /* do zmiennej s jest dopisywana zmienna cyfra, która mówi nam jaka jest
        reszta liczby K po dzieleniu przez 10, a następnie liczba K jest zmiejszana 
        o 10 po każdym przejściu pętli. To znaczy że liczba będzie odczytana od tyłu.
         * 
        */
        }

        public void task02(){
            int i=1;
            int s=0;
            while(i<10){
                i++;
                s=s+1;
            }
        }

        public void task03(){
            int i =0;

            while (i > 0) {
                System.out.println("To się nigdy nie wykona!");
            }
            
            
            do {
                System.out.println("To wykona się co najmniej raz!");
            } while (i > 0);

        }

        public static void task04(){
            for(int i=0; i<10; i++){
                System.out.print((1/Math.pow(2,i)) + "   ");
            }
        }

        public static void task05(){

            int wrt = 2;

            for(int i=0; i<10; i++){
                System.out.print(wrt*(1/Math.pow(2,i)) + "   ");
            }
        }

        public static void task06(){
            for(int i=-1500; i<1500; i++){
                if(i%2==0 && i%3==0){
                    System.out.println(i);
                }
            }
        }

        public static void task07(){
        
            for(int i=1; i<=5; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void task08(){
            String[] directions = {"->North", "->East", "->South", "->West"}; 
        int kierunek = 0; 
        
        java.util.Scanner in=new java.util.Scanner(System.in) ;
        System.out.println("Orientacja początkowa: " + directions[kierunek]);
        
        while (true) {
            System.out.print("Obróć w lewo (A) lub prawo (D): ");
            char c = in.next().charAt(0);
            
            if (c == 'A' || c == 'a') {
                kierunek = (kierunek + 3) % 4; // obrót o 90 stopni w lewo
            } else if (c == 'D' || c == 'd') {
                kierunek = (kierunek + 1) % 4; // obrót o 90 stopni w prawo
            } else {
                System.out.println("Nieprawidłowy klawisz!");
                continue;
            }
            
            System.out.println("Aktualna orientacja: " + directions[kierunek]);
        }
        }

        
    public static void main(String[] args){
        // task04();
        
        //task05();
        
        //task06();

        System.out.println();

        //task07();

        task08();

        
    }
}