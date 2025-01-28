public class c23{
    public static void main (String [] args){
        
        Owoc[] tab = new Owoc[100];

        double waga=0;
        int j=0;
        int p=0;
        int g=0;
     
        for(int i=0; i<tab.length; i++){
            tab[i]= Drzewo2.zerwijOwoc();
            waga=waga+tab[i].getMasa();
            if(waga>=5000){
                break;
            }
            if((tab[i].getNazwa()).equals("jablko")){
                j++;
            } else if((tab[i].getNazwa()).equals("pomarancza")){
                p++;
            } else if((tab[i].getNazwa()).equals("gruszka")){
                g++;
            }
        }

        System.out.println("laczna waga owocow: " + waga);
        System.out.println("ile jablek: " + j);
        System.out.println("ile gruszek: " + g);
        System.out.println("ile pomaranczy: " + p);
        
        
    }
}

class Owoc{
    private String nazwa;
    private double masa;

    public Owoc(String nazwa, double masa){
        this.nazwa=nazwa;
        this.masa=masa;
    }

    public double getMasa(){
        return this.masa;
    }

    public String getNazwa(){
        return this.nazwa=nazwa;
    }
}

class Jablko extends Owoc{
    public Jablko(){
    super("jablko", 100+Math.random()*150);
    }
}

class Pomarancza extends Owoc{
    public Pomarancza(){
    super("pomarancza", 100+Math.random()*150);
    }
}

class Gruszka extends Owoc{
    public Gruszka(){
    super("gruszka", 100+Math.random()*150);
    }
}

class Drzewo2{
    public static Owoc zerwijOwoc(){
        int losuj =(int)(Math.random()*3);
        return switch (losuj){
            case 0 -> new Jablko();
            case 1 -> new Pomarancza();
            case 2 -> new Gruszka();
            default -> new Owoc(" ", 0);
        };

    }
}



