import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = sc.nextLine();
		if ("+".equals(op) || "-".equals(op) || "*".equals(op) || "/".equals(op)) {
			float a = Float.parseFloat(sc.nextLine());
			float b = Float.parseFloat(sc.nextLine());
			if ("+".equals(op)) {
				float resultado = (a + b);
				System.out.println("RESULTADO: " + resultado);
			}
			if ("-".equals(op)) {
				float resultado = (a - b);
				System.out.println("RESULTADO: " + resultado);
			}
			if ("*".equals(op)) {
				float resultado = (a * b);
				System.out.println("RESULTADO: " + resultado);
			}
			if ("/".equals(op)) {
				if (b == 0) {
					System.out.println("ERRO");
				} else {
					float resultado = (a / b);
					System.out.println("RESULTADO: " + resultado);
				}
			}
		} else {
			System.out.println("ENTRADA INVALIDA");
		}
	}
}
