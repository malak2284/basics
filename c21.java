public class c21{
    public static void main(String[] args){
        //Zad.1
        // Prostopadloscian p1 = new Prostopadloscian(2,2,3);
        // p1.showP();


        // Ostroslup o1 = new Ostroslup(2,4,5);
        // o1.showO();


        // Graniastoslup g1= new Graniastoslup (27,2,3);
        // g1.showG();


        //Zad.2
        // Spawacz s1 = new Spawacz("Marcin", 19);
        // s1.Wyswietl();


        //Zad.3
        // CiagnikSiodlowy c1=new CiagnikSiodlowy("czerwony", 2, 10);
        // c1.rozpocznijJazde();


        // Zad.4
        Drzewo d1 = new Drzewo(true, 5, "40 metrów");
        System.out.println(d1. toString());


        // Zad.5
        DrzewoIglaste drzewoIglaste = new DrzewoIglaste(false, 10, "100 metrów", 120938, 11.5);
        System.out.println(drzewoIglaste.toString());

        DrzewoLisciaste drzewoLisciaste = new DrzewoLisciaste(true, 30, "27 kilometry", 5);
        System.out.println(drzewoLisciaste.toString());

        DrzewoOwocowe drzewoOwocowe = new DrzewoOwocowe(false, 26, "56 km", 6, "mango");
        System.out.println(drzewoOwocowe.toString());
        
    }
}
// Zad.1
// class Prostokat{
//     private int bok1;
//     private int bok2;

//     public Prostokat(int a, int b){
//         bok1=a;
//         bok2=b;
//     }

//     public void show(){
//         System.out.println("pole powierzchni: "+ bok1*bok2);
//     }

//     public int getBok1(){
//         return bok1;
//     }

//     public int getBok2(){
//         return bok2;
//     }
// }

// class Prostopadloscian extends Prostokat{
//     private int wysokosc;

//     public Prostopadloscian(int a, int b, int h){
//         super(a, b);
      
//         wysokosc=h;
//     }

//     public void showP(){
//         System.out.print("pole powierzchni: "+ ((super.getBok1()*super.getBok2()*2)+(super.getBok1()*wysokosc*2)+(super.getBok2()*wysokosc*2)) +"; ");
//         System.out.print("objetosc: "+ super.getBok1()*super.getBok1()*wysokosc);
//     }
// }


// class Trojkat{
//     private double bok1;
//     private double wys1;

//     public Trojkat(double a, double h1){
//         bok1=a;
//         wys1=h1;
//     }

//     public double PolePowierzchni(){
//        return (bok1*wys1)/2;
//     }

//     public double getBok1(){
//         return bok1;
//     }
//     public double getWys1(){
//         return wys1;
//     }
// }



// class Ostroslup extends Trojkat{
//     private double wys2;

//     public Ostroslup(double a, double h1, double h2){
//         super(a, h1);
//         wys2=h2;
//     }

//     public double PoleBoczne(){
//         return (Math.sqrt(((1.0/3)*getWys1())*((1.0/3)*getWys1())+wys2*wys2))*getBok1()*(1.0/2)*3;
//     }

//     public void showO(){
//         System.out.println("Pole Ostroslupu " + (super.PolePowierzchni()+PoleBoczne()));
//         System.out.println("Objetosc "+ super.PolePowierzchni()*wys2);
//     }
// }


// class Graniastoslup extends Trojkat{
//     private double wys2;

//     public Graniastoslup(double a, double h1, double h2){
//         super(a, h1);
//         wys2=h2;
//     }

//     public void showG(){
//         System.out.print("pole powierzchni: "+ ((super.PolePowierzchni()*2)+(getBok1()*wys2*3)));
//         System.out.print("; Objętość: "+ (super.PolePowierzchni()*wys2));
//     }
// }




//Zad.2
// class Osoba{
//     private String imie;

//     public Osoba(String imie){
//         this.imie=imie;
//     }

//     public String Wyswietl(){
//         return ("imie: " + imie);
//     }

// }

// class Spawacz extends Osoba {
//     private int Stazpracy;

//     public Spawacz(String imie, int Stazpracy){
//         super(imie);
//         this.Stazpracy=Stazpracy;
//     }

//     public String Wyswietl(){
//         System.out.println(super.Wyswietl() + "Staz pracy: "+ Stazpracy);
//         return super.getimie();
//     }
// }


// Zad.3
// class Pojazd{
//     private String color;

//     public Pojazd(String color){
//         this.color=color;
//     }
// }

// class PojazdKolowy extends Pojazd{
//     private int IloscOsi;

//     public PojazdKolowy(String color, int IloscOsi){
//         super(color);
//         this.IloscOsi=IloscOsi;
//     }

//     public int getIloscOsi(){
//         return IloscOsi;
//     }
// }

// class CiagnikSiodlowy extends PojazdKolowy{
//     private int masa;

//     public CiagnikSiodlowy(String color, int IloscOsi, int masa){
//         super(color, IloscOsi);
//         this.masa=masa;
//     }

//     public void rozpocznijJazde(){
//         if(masa/getIloscOsi()>11){
//             System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
//         } else{
//             System.out.println("Jazda Bezpieczna");
//         }
//     }
// }


// Zad.4
class Drzewo{
    private boolean wiecznieZielone;
    private int wysokosc;
    private String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.wiecznieZielone=wiecznieZielone; 
        this.wysokosc=wysokosc;
        this.przekrojDrzewa=przekrojDrzewa;
    }   

    public boolean getwiecznieZielone(){
        return wiecznieZielone;
    }

    public int getwysokosc(){
        return wysokosc;
    }

    public String getprzekrojDrzewa(){
        return przekrojDrzewa;
    }


    public String toString(){
        return wysokosc + " " + wiecznieZielone + " " + przekrojDrzewa;
    }
}


// Zad.5
class DrzewoIglaste extends Drzewo{
    private int iloscIgiel;
    private double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki){
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel=iloscIgiel;
        this.dlugoscSzyszki=dlugoscSzyszki;
    }

    public String toString(){
        return getwiecznieZielone() + " " +  getwysokosc() + " " + getprzekrojDrzewa() +" "+ iloscIgiel + " " + dlugoscSzyszki ;
    }
}


class DrzewoLisciaste extends Drzewo{
    private int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia){
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia=ksztaltLiscia;
    }

    public int getksztaltLiscia(){
        return ksztaltLiscia;
    }

    public String toString(){
        return getwiecznieZielone() + " " +  getwysokosc() + " " + getprzekrojDrzewa() + " kszalt Liscia:" + ksztaltLiscia ;
    }

}


class DrzewoOwocowe extends DrzewoLisciaste{
    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca){
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca=nazwaOwoca;
    }

    public String toString(){
        return getwiecznieZielone() + " " +  getwysokosc() + " " + getprzekrojDrzewa() + " " + getksztaltLiscia() + " " + nazwaOwoca ;
    }
}





