public class Program5 {
	public static void main (String [] args) {
		
		if (13%2==0 || 13%3==0 || 13%5==0 || 13%7==0){ // Zad.1
			System.out.println("nie jest liczbą pierwszą");
		} else {
			System.out.println("jest liczbą pierwszą");
		}
		
		
		
		if (15%2==0 || 15%3==0 || 15%5==0 || 15%7==0){ // Zad.1
			System.out.println("nie jest liczbą pierwszą");
		} else {
			System.out.println("jest liczbą pierwszą");
		}
		
		if (17%2==0 || 17%3==0 || 17%5==0 || 17%7==0){ // Zad.1
			System.out.println("nie jest liczbą pierwszą");
		} else {
			System.out.println("jest liczbą pierwszą");
		}
		
		
		boolean czyPada=true;  // Zad.2
		
		if (czyPada==true) {
			System.out.println ("pada");
		} else {
			System.out.println ("nie pada");
		}
		
		if (czyPada==true){  // Zad.3
			int x = 5;
			System.out.println(x);
		} else {
			int y = 8;
			System.out.println(y);
		}
		
		
		boolean czySwieciSlonce=true;  // Zad.4
		
		if (czyPada==true && czySwieciSlonce==true){
			System.out.println("tęcza");
		} 	else if (czyPada==false && czySwieciSlonce==false){
			System.out.println("puchmurno");
		} 	else if (czyPada==true && czySwieciSlonce==false){
			System.out.println("plucha");
		} 	else if (czyPada==false && czySwieciSlonce==true){
			System.out.println("słonecznie");
		}
		
		
			
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int num = scanner.nextInt();
		int num1 = scanner.nextInt();
		
		
		
		if (num>0 && num1>0){  // Zad.6
			System.out.println(num-num1);
		} else {
			System.out.println(num+num1);
		}
		
		
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if (num3%num2==0){ // Zad.7
			System.out.println("stanowi całkowitą wielokrotność");
		} else {
			System.out.println("nie jest wieloktonoscia");
		}

		/* Zad.8 
				dla a=-3
			dla kodu 1 będzie: Negative					dla kodu 2 będzie: Negative
							   Absolute value is: 3                        Absolute value is: 3

				dla a=0
			dla kodu 1 będzie: Positive				  	dla kodu 2 będzie: Positive 
							   Abolute value is: 0 						   Absolute value is: 0
				dla a=5
			dla kodu 1 będzie: Positive					dla kodu 2 bedzie: Positive
							   Absolute value is: 5						   Absolute value is: 5
		
		Przypuszczenie było poprawne
		*/

		

		double x1=Math.random(); // Zad.9
		double x2=Math.random();
		double x3=Math.random();
		if (x1>0.2 && x2>0.2 && x3>0.2){
			System.out.println("tak");
		}
		double x4=Math.random();
		if (x2>0.2 && x3>0.2 && x4>0.2){
			 System.out.println("tak");
		 }
		double x5=Math.random();
		
		 if (x3>0.2 && x4>0.2 && x5>0.2){
			 System.out.println ("tak");
		 }
		
	




		
		
		
		
		
	}


}