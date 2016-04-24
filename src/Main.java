import java.util.Scanner;

/**
 * 
 */

/**
 * @author Diego Miguel
 *
 */
public class Main {
	static Scanner leitor = new Scanner(System.in);
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opcaoEscolhida, numeroEhPar = 0;
		double n1 = 0, n2 = 0;
		
		do {
			opcaoEscolhida = menu();
			
			if (opcaoEscolhida == 0){
				continue;
			}else if(opcaoEscolhida == 5){
				numeroEhPar = (int)lerNumero("Qual o numero a analisar? "); 
			}else{
				System.out.println("De os numeros na sequencia que devem ser tratados");
				n1 = lerNumero("Qual o primeiro numero? ");
				n2 = lerNumero("Qual o segundo numero? ");
			}
			
			switch (opcaoEscolhida) {
			case 1:
				System.out.println(Calculadora.somar(n1, n2));
				break;
			case 2:
				System.out.println(Calculadora.subtrair(n1, n2));
				break;
			case 3:
				System.out.println(Calculadora.multiplicar(n1, n2));
				break;
			case 4:
				System.out.println(Calculadora.dividir(n1, n2));
				break;
			case 5:
				System.out.println("ehPar? " + Calculadora.ehPar(numeroEhPar));
				break;
			case 6:
				System.out.println(Calculadora.potencia((int)n1, (int)n2));
				break;
			default:
				System.out.println("Valor Invalido!");
				break;
			}
			
		} while (opcaoEscolhida != 0);
		
		
	}
	
	private static double lerNumero(String mensagem){
		System.out.print(mensagem);
		return leitor.nextDouble();
	}
	
	private static int menu(){
		System.out.println("Menu calculadora:");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("5 - EhPar");
		System.out.println("6 - Potencia");
		System.out.println("0 - Sair");
		System.out.print("Digite a opcao desejada: ");
		return leitor.nextInt();
	}

}
