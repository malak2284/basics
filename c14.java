public class c14{
    public static void main (String[] args){

        /*
        float[][] tab= new float[8][8];
        for(int i=0; i<tab.length; i++){
        
            for(int j=0; j<tab[i].length; j++){
                tab[i][j]=(float)(Math.random()*10);
                System.out.print(tab[i][j]+ " ");

            }
            System.out.println();
        }
        int i=0;
        float a=0;
        while(i<tab.length){
            
            a=a+tab[i][tab.length-1-i];
            i++;
        }  
        System.out.println("suma prawej przekątnej "+a);

        i=0;
        a=0;
        while(i<tab.length){
            a=a+tab[i][i];
            i++;
        }
        System.out.println("suma lewej przekątnej "+a);
        */


        int[][] tab= new int[4][8];
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                tab[i][j]=(int)(Math.random()*10);
                System.out.print(tab[i][j]+ " ");
            }
            System.out.println();
        }

        int średnia=0;
        for(int i=0; i<tab.length; i++){

            for(int j=0; j<tab[i].length; j++){

                 średnia=średnia+tab[i][j];

                tab[i][j]=(int)(Math.random()*10);
                System.out.print(tab[i][j]+ " ");

            }
            System.out.println();
        }

        System.out.println("Średnia to " + średnia/(4*8));
        System.out.println("Najbliższa liczba do średniej to " + a);


        
    }
}