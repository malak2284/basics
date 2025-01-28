public class c11{
    public static void main (String[] args){

     
        double[] tab = new double [10];

        /*
            for(int i=0; i < tab.length ; i++){
                tab[i] = Math.random()*10;
                System.out.println(tab[i]);
            }
            
        */

      
        /*
        for (int i = 0; i<tab.length; i=i+2){
            tab[i] = Math.random()*10;
           
        
            if ((int)tab[i]%2==1){
            System.out.println((int)tab[i]);
            }
        }
        */

        char [] tabl = {'z' , 'c', 'a'};

        int max = tabl[0];

        for(int i=1; i < tabl.length; i++){
            if(max > (int)tabl[i]){
                max = tabl[i];
                System.out.println("najmniejszą wartość ma "+ (char)max);
             
            } else {
            System.out.println("najmniejszą wartość ma "+ (char)max);
            }
        }

        System.out.println((char)33);
        



            

                     
        
    }
}
