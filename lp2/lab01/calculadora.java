import java.util.Scanner;
public class calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operacao = sc.next();
		if (operacao == "+") {
			float a = sc.nextFloat();
                        float b = sc.nextFloat();
			float resultado = (a + b);
			System.out.println("RESULTADO: " + resultado);
		}
		if (operacao == "-") {
			float a = sc.nextFloat();
                        float b = sc.nextFloat();
			float resultado = (a - b);
			System.out.println("RESULTADO: " + resultado);
		}
		if (operacao == "*") {
			float a = sc.nextFloat();
                        float b = sc.nextFloat();
			float resultado = (a * b);
			System.out.println("RESULTADO: " + resultado);
		}
		if (operacao == "/") {
			float a = sc.nextFloat();
                        float b = sc.nextFloat();
			if (b == 0) {
				System.out.println("ERRO");
			} else {
				float resultado = (a / b);
				System.out.println("RESULTADO: " + resultado);
			}
		}
		
	}
}

