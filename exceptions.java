public class exceptions{
    public static void main(String[] args){
        try{
            int[] tab={1,2,3};
            System.out.println(tab[10]);
        } catch (Exception e){
            System.out.println("cos poszlo nie tak");
        }
    }
}