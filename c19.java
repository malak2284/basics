public class c19{
    public static void main(String[] args){
        Kwadrat kwadrat = new Kwadrat(5);
        kwadrat.show();

        Walec walec = new Walec (3,4);
        walec.show();
    }
}

class Kwadrat{
    private int bok;

    public Kwadrat(int b){
        bok=b;
    }

    public void show(){
        System.out.println("Pole powierzchni to: " + bok*bok);
        System.out.println("objętość sześcianu " + bok*bok*bok);
    }
}


class Walec{
    private double promień;
    private double wysokość;

    public Walec(double r, double h){
        promień=r;
        wysokość=h;
    }

    public void show(){
        System.out.print("Pole Powierzchni: "+Math.PI*promień*promień+";");
        System.out.print(" Objętość: "+ (Math.PI*promień*promień)*wysokość);
    }
}

class KulaW{
    
}

