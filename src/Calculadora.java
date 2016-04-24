/**
 * 
 */

/**
 * @author ads
 *
 */
public class Calculadora {
	public static double somar(double num1, double num2){
		return num1+num2;	
	}
	
	public static double subtrair(double num1, double num2){
		return num1-num2;	
	}
	
	public static double multiplicar(double num1, double num2){
		return num1*num2;	
	}

	public static double dividir(double num1, double num2){
		if (num2 == 0){
			System.err.println("O segundo numero nao pode ser zero!");
			System.exit(1);
		}
		return num1/num2;
	}
	
	public static boolean ehPar(int valor){
		return (valor % 2 == 0);
	}
	
	public static int potencia(int base, int expoente){
		int potencia = 1;
		for (int i = 0; i < expoente; i++) {
			potencia *= base;
		}
		return potencia;
	}
}
