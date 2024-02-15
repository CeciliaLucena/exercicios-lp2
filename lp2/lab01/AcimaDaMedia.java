import java.util.Scanner;

public class AcimaDaMedia {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String elementos = sc.nextLine();
		String[] numerosString = elementos.split(" ");
		
		int[] numeros = new int[numerosString.length];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(numerosString[i]);
		}
		
		int soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		
		int media = soma / numeros.length;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > media) {
				System.out.print(numeros[i] + " ");
			}
		}
		sc.close();
	}
}
