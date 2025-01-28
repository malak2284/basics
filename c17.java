public class c17{
    public static void main(String[]args){

        int[][] tab= new int[5][3];
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                tab[i][j]=(int)(Math.random()*10);
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }

        

    trans(tab);

    int NWD=gcdI(30,10);
    System.out.println(NWD);
    
    } 
    static void trans(int tab[][]){
    int k=0;
    for(int i=0; i<tab.length; i++){
        for(; k<tab[i].length; k++){

        }
    }

    int[][] tab1= new int[tab[k].length][tab.length];
    
    for(int i=0; i<tab1.length; i++){
        for(int j=0; j<tab1[i].length; j++){
            tab1[i][j]=tab[j][i];
            System.out.print(tab1[i][j]+" ");
        }
        System.out.println();
    }
    }


    static int gcdI(int a, int b){
        int k=0;
        if(a>b){
        for(int i=1; i<a; i++){
            if(a%i==0 && b%i==0){
                k=;
            } 
        }
        } else{
            for(int i=1; i<b; b++){

            }
        }

       return k;
       
}
}