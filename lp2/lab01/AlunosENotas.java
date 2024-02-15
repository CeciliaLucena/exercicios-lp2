import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class AlunosENotas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> notas = new ArrayList<>();
		int maior = 0;
		int menor = 1000;
		int soma = 0;
		int n = 0;
		int maismedia = 0;
		int menosmedia = 0;
	
		while (true) {
			String input = sc.nextLine();
			if ("-".equals(input)) {
				break;
			}
			n += 1;
			String[] info = input.split(" ");
			notas.add(Integer.parseInt(info[1]));
			soma += Integer.parseInt(info[1]);
		}
		int media = soma / n;
		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i) > maior) {
				maior = notas.get(i);
			}
			if (notas.get(i) < menor) {
				menor = notas.get(i);
			}
			if (notas.get(i) >= 700) {
				maismedia += 1;
			}
			if (notas.get(i) < 700) {
				menosmedia += 1;
			}
		}
		
		System.out.println("maior: " + maior);
		System.out.println("menor: " + menor);	
		System.out.println("media: " + media);
		System.out.println("acima: " + maismedia);
		System.out.println("abaixo: " + menosmedia);
	}
}	
