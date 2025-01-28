import java.util.*;

public class c18{
    public static void main(String[] args){
        Person person = new Person();

        person.name="Filip";
        person.surname="Malak";
        person.birthyear=17;

        Fruit fruit= new Fruit("mango");
         fruit.show(); 
       


        
    }
}

class Person{
    public String name;
    public String surname;
    public int birthyear;
}

class Fruit{
    String name;
    double weight;

    public Fruit (String name) {
        this.name = name;
        weight = new Random().nextDouble(0.5, 0.8);
    }

    public void show(){
        System.out.println("Fruit: "+ name + ","+ weight);
    }
}

class Baloon{
    int wielkość;
    double pojemność;
    int udzwig;

    public Baloon(int wielkość){
        this.wielkość=wielkość;
        pojemność= new Random().nextDouble(0.005, 0.009);
    }
}
