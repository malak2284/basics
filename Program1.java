public class Program1{
	public static void main (String[] args) {
		
		System.out.println(0x28494); // Zad.1
		System.out.println(0b10_1000_0100_1001_0100);
		
		double sqTwo = Math.sqrt(2); // Zad.2
		System.out.println(sqTwo*sqTwo-2);
		
		double p=(sqTwo*sqTwo-2); // Zad.3
		System.out.println(p);
		
			
		
		int x=5;		// Zad.4
		System.out.println((x=4)*x);
		
		
	
	
		
		
		java.util.Scanner scanner=new java.util.Scanner(System.in) ; // Zad.6
		int y=scanner.nextInt() ;
		
		if (y%400== 0 || (y%4==0 && y%100!=0)) {
			System.out.println("rok jest przestepny");
			} 
		else System.out.println("nie jest przestepny");
		
		
		
		
		int z=scanner.nextInt() ; // Zad.5
		
		System.out.println((z-32.0)*5/9);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println(0.1+0.1+0.1); // nie wychodzi 0.3 (double nie jest dokładny)
		*/
		
	
		
	
		
		
	
	
	
	}
}