public class c16{
    public static void main(String[] args){

        ///////////////////////////////////////////////////////////
        //Zad.1
        
        int[][] a= new int[3][4];
       
        int[][] b= new int[3][4];
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j]=i*j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-------");
        
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++){
                b[i][j]=i*j;
                System.out.print(b[i][j]+" ");

            }
            System.out.println();
        }

        jestRowna(a, b);
    
    //////////////////////////////////////////////////////////////
    //Zad.2
    

    int tablica = 5;

    splitToDigits(tablica);

    ////////////////////////////////////////////////////////////





    }
    ///////////////////////////////////////////////////////////////
    //Zad.1

    static void jestRowna(int a[][], int b[][]){
         
        boolean e= true;
        boolean c= true;

         for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(a.length==b.length && a[i].length==b[i].length){
                 if(a[i][j]==b[i][j]){

                    if(c==false){
                        e=false;
                    }  

                    }
                } else {
                    e=false;
                    
                }
            }
        }

        System.out.println(e);
    }

    //////////////////////////////////////////////////////////
    //Zad.2

    static void splitToDigits(int tablica){
        int[] tab=new int[tablica];
        for(int i=0;i<tab.length; i++){
            tab[i]=tablica;
            System.out.print(tab[i]+" ");
        }
    }

    
        
    
}