public class Zadania {
    public static void main(String[] args) {

        /*
         * for(int i=1; i<=10; i++){
         * for(int j=1; j<=10; j++){
         * System.out.print(i*j + " ");
         * }
         * System.out.println();
         * }
         */
        /*
         * 
         * int rozmiar=8;
         * for(int i=1; i<=15; i++){
         * for(int j=1; j<=8; j++){
         * if((j>=i && j<(rozmiar-i)) || (j <= i && j>=(rozmiar -i-1))){ // Nie ma
         * podanego poprawnego warunku :(
         * System.out.print("*");
         * } else{
         * System.out.print(" ");
         * }
         * }
         * System.out.println();
         * }
         */

        // int a = 0;
        // while (a < 25) {
        //     a++;
        //     if (a <= 3 && a % 2 == 0 && a % 3 == 0) {
        //         System.out.println(a);
        //     } else {

        //     }
        // }

       char c='C',f='F';
       if(c%f != 0){
        System.out.println(c+4);
       } else {
        System.out.println(f-2);
       }
    }
}