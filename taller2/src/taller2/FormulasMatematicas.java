package taller2;

import java.util.Scanner;

import static java.lang.Math. *;

public class FormulasMatematicas {
	
	Scanner sc = new Scanner(System.in);
	public void calcularRaiz() {
		
		
	    
		System.out.println("que ecuacion desea realizar" + "\n" + "1. a"+ "\n"+"2. b"+ "\n"+"3. c"+ "\n"+"4. d"+ "\n"+"5. e"+ "\n"+"6. f");
	
		System.out.println("digite el valor de x");
		double x=sc.nextInt() ;
	  
	double a= (double) Math.sqrt(Math.pow(x, 5)-6)/4;
		System.out.println(a);
}
}
