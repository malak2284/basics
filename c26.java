 public class c26{
    public static void main(String[] args){
        Osoba o1 = new Osoba("Kamil");
        Osoba o2 = new Osoba("Filip");

        RachunekBankowy r1= new RachunekBankowy(o1, 1000);
        RachunekBankowy r2= new RachunekBankowy(o2, 2000);

       

        r1.przelew(r2,100);

        r1.wyplata(-1200);

        // KontoVIP kv1 = new KontoVIP(o1, 1000, 1, -1000);
        // kv1.wyplata(1000);
    }
}


class Osoba{
   protected String imie;
   
   public Osoba(String imie){
        this.imie=imie;
   }
}



class RachunekBankowy{
    private Osoba wlasciciel;
    public double stan;

    public RachunekBankowy(Osoba wlasciciel, double stan){
        
        this.wlasciciel=wlasciciel;
        this.stan=stan;
    }

    public void wplata(double kwota){

        // if(kwota>=0){
        stan=stan+kwota;
        System.out.println("Kwota po wpłacie: " + stan);
        // } else{
        //     throw new BlednaOperacjaException("kwota musi być dodatnia");
        // }
        
        
    }


    public void wyplata(double kwota) throws BlednaOperacjaException
    {
        Blad blad = new Blad();
        try{
            blad.Blad(kwota);
            stan=stan-kwota;
            System.out.println("kwota po wypłacie: " + stan);
        } catch(BlednaOperacjaException e){
            throw new BlednaOperacjaException("fsadihf");
        }
       
    }


    public void przelew(RachunekBankowy rach, double kwota){
        wyplata(kwota);
        rach.wplata(kwota);

        System.out.println("kwota przelewu: " + kwota);
    }

}



class Konto extends RachunekBankowy{
    private double oprocentowanie;

    public Konto(Osoba wlasciciel, double stan, double oprocentowanie){
        super(wlasciciel, stan);
        this.oprocentowanie=oprocentowanie;
    }
}


class KontoVIP extends Konto{
    private double limitDebetu;

    public KontoVIP(Osoba wlasciciel, double stan, double oprocentowanie, double limitDebetu){
        super(wlasciciel, stan, oprocentowanie);
        this.limitDebetu=limitDebetu;
    }

@Override
    public void wyplata(double kwota){
        super.wyplata(kwota);
        if((stan-kwota)>=limitDebetu){
            
            System.out.print("wyplacono: " +kwota);
        } else{
            stan=stan+kwota;
            System.out.print ( " operacja nie moze zostac wykonana: " + stan);
        }
}
}

class Blad{
    public void Blad(double kwota) throws BlednaOperacjaException{
        if(kwota<0){
            throw new BlednaOperacjaException("bledna operacja");
        } 
    }
}



