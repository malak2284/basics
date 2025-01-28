public class c15{
    public static void main(String[] args){
        
        /*         DO POPRAWY
        int a=0;
        int[][] tab= new int[4][8];
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                tab[i][j]=(int)(Math.random()*10);
                a=(tab.length)*(tab[i].length);
                System.out.print(tab[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("łączna liczba elementów w tablicy" + a);

        int[] tabj=new int[a];
        int i=0;
        int j=0;
        int k = 0;
        while(i<tab.length){
           j = 0; 
            while(j<tab[i].length){
                tabj[k] = tab[i][j];
                j++;
                System.out.print(tabj[k]+ " ");      
                k++;
            }
             i++;
        }
        */

       
        

        
    // Zad. 2 show(10);

    // Zad.3
    //int wrt=5;
    //modifyValue(wrt);

    // Zad. 4
    // findMax(98327,03274,9348);

    
    char[] tab={'A','l','a','m','a','k','o','t','a'};
    ilerazy(tab);

    }

    // Zad.2
    //static void show(int a){
    //  System.out.println(a);
    // }

    // Zad.3
    //static void modifyValue(int wrt){
        //System.out.println(wrt);
        //wrt=wrt*5;
        //System.out.println(wrt);
    //}

    // Zad. 4
    //static void findMax(int a, int b, int c){
        //if(a>b){
        //    System.out.println(a);
        //} else if(b>c){
        //    System.out.println(b);
        //} else{
        //    System.out.println(c);
        //}
    //}

    static void ilerazy(char tab[]){

        int a=0;
    
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length; j++){
            
            if(tab[i]==tab[j]){
                System.out.println(tab[i]+" sie powtarza");
            } else {
                System.out.println
            }
           
        
            
            }
        }
    }


}
