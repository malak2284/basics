public class c22{
    public static void main (String[] args){
        Telefon t1= new Telefon();
        t1.zadzwon("514-343-432");

        Komorka k1= new Komorka();


        // Zad.5

        // Telefon[] tab =  new Telefon[3];
        // tab[0]=new Smartfon[];
      
    }
}

// Zad. 1
class Telefon{
    protected String kolor;

    protected void zadzwon(String numer){
        System.out.println(numer);
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("brak historii");
    }
}


// Zad. 2
class Komorka extends Telefon{
    
    private String [] numery = new String[10];
    private int n=0;

@Override
    protected void zadzwon(String numer){
        super.zadzwon(numer);

        if(n == numery.length){
            for(int i=0; i<n-1;i++){
                numery[i] = numery[i+1];
            }

            n=n-1; 
        }

        numery[n++] = numer;
    }
    
    public void wyswietlHistoriePolaczen(){
        for(int i=0; i<numery.length; i++){
            System.out.println(numery[i]);
        }
    }
}


// Zad.3
// class Osoba{
//     public String imie;
//     public String nazwisko;
//     public String numer;

// }

// class Smartfon extends Komorka{
//     private Osoba[] znajomi=new Osoba[3];

//     public void wyswietlHistoriePolaczen(){
//         for(int i=0; i<znajomi.length; i++){

//             if(imie.equals(znajomi[i].imie)){
//                 System.out.println(znajomi[i]);
//             }
//         }
//     }
// }

// Zad.5



