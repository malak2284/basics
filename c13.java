public class c13{
    public static void main(String[] args){

        
        int[] x= new int[6];
            
            for(int i=0; i<x.length; i++){
                x[i]=(int)(Math.random()* 10);
            }

        int[] y= new int[6];
            
            for(int j=0; j<y.length; j++){
                y[j]=(int)(Math.random() * 10);
            }

        int minX =x[0], maxX = x[0];
            for(int a=1; a<x.length; a++){
                if(minX > x[a]){
                    minX = x[a];
                } else if (maxX < x[a]){
                    maxX = x[a];
                }
            }

         System.out.println(minX + ", " + maxX);


        int minY =x[0], maxY = x[0];
            for(int b=1; b<y.length; b++){
                if(minY> y[b]){
                    minY = y[b];
                } else if (maxY < y[b]){
                    maxY = y[b];
                }
            }

        System.out.println(minY + ", " + maxY);
        System.out.println("współrzędne środka" + (maxX+minX)/2.0 + "," + (maxY+minY)/2.0);
        System.out.println("wysokość " + (maxX-minX));

        
    }
}