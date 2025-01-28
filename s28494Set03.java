public class s28494Set03{

    public void task01(){
        byte aa = -128;
        byte ab = 127;

        short bb = -32768;
        short bc = 32767;

        int cc = (int)(Math.pow(-2,31));
        int cd = (int)(Math.pow(2,31));

        long dd = (long)(Math.pow(-2,63));
        long de = (long)(Math.pow(2,63));

        float ee = (float) (Math.pow(2, 127) * (2 - Math.pow(2, -23)));
        float ef = (float)(Math.pow(2, -149));

        double ff = Math.pow(2, 1023) * (2 - Math.pow(2, -52));
        double fg = Math.pow(2, -1074);

        char gg = 0;
        char gh = 65535;

        boolean hh = true;
        boolean hi = false;
        }

    public void task02(){
            boolean isTrue = true;
            int integer = 2147483647;
            double doubleNumber = 2.718281828459045;
            char character = 'A';

            // System.out.println(isTrue == integer);
            // System.out.println(isTrue == doubleNumber);
            // System.out.println(isTrue == character);

            System.out.println(integer == doubleNumber);
            System.out.println(integer == character);

            System.out.println(doubleNumber == character);
        }

    public void task03(){
        int l12;
        // int 12d;
        // int @as;
        // int static;
        // int null;
    }

    static public void task04(){
        int liczba = 12;
        System.out.println(liczba);
    }

    public void task05(){
        char charValue = 'A'; 
        char charvalue = 'a';
        // Oczywiście, że się 
        // skompiluje, jest to poprawnie 
        // zainicjowana zmienna typu char

    }

    public void task06(){
        int a = 1;
        double b = 2.0;
        // a=b;
        b=a;
    }
        
    public void task07(){
        byte k = 1;
        char l= 'a';
        int o = 4;
        float f = 21;
        double  dab = 0.1;

        // char wynik = l + o;
        int wynik1 = o + l;
        // float wynik2 = f + dab;
        // byte wynik3 = k + o;

        char wynik = (char)(l + o);
        float wynik2 = (float)(f + dab);
        byte wynik3 = (byte)(k + o);

    }

    public static void main(String[] args){
        task04();
    }
    
}