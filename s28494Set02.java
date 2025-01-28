public class s28494Set02{
        
            
        public void task01(){
                int a = 165;

                String bin = Integer.toBinaryString(a);
                System.out.println(a  + " w systemie binarnym to: " + bin);

                String oct = Integer.toOctalString(a);
                System.out.println(a  + " w systemie oktalnym to: " + oct);

                String hex = Integer.toHexString(a);
                System.out.println(a + " w systemie heksalnym to: " + hex);
        }

        public void task02(){
            int b = 14;

            int wPrawo0 = b >> 0;
            int wLewo2 = b << 2;
            int wPrawo4 = b >> 4;
        }

        public void task03(){
            int c = 100;

            int ostatnie5 = c & 0b000_0000_0000_0000_0000_0000_0001_1111;
            System.out.println("Wartość reprezentowana przez ostatnie 5 bitów: " + ostatnie5);

            int siódmyBit = c & 0b000_0000_0000_0000_0000_0000_0100_0000;
            System.out.println("Wartość siódmego bitu: " + ((siódmyBit == 0) ? 0 : 1));

            int pierwszyBajt = (c >> 24) & 0xFF;
            int drugiBajt = (c >> 16) & 0xFF;
            int trzeciBajt = (c >> 8) & 0xFF;
            int czwartyBajt = c & 0xFF;
            System.out.println("Wartości bajtów (od najbardziej znaczącego): "
                + pierwszyBajt + " " + drugiBajt + " " + trzeciBajt + " " + czwartyBajt);

            int środkoweBajty = (c >> 8) & 0xFFFF;
            System.out.println("Wartość reprezentowana przez dwa środkowe bajty: " + środkoweBajty);
        }

        public void task04(){
            int a1= 0x6D, a2=15,a = a1&a2,
            b1= 0xA, b2=15, b=b1 | b2,
            c1= 11 << 2 ,c2=6,c=c1^c2;

            System.out.println(a+" "+b+" "+c);
        }
            


        
}