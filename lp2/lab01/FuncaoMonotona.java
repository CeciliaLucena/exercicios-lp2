import java.util.Scanner;
public class FuncaoMonotona {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		boolean base = false;
		if (a > b) {
			if (b > c) {
				if (c > d) {
					System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
					base = true;
				}
			}
		}
		if (a < b) {
			if (b < c) {
				if (c < d) {
					System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
					base = true;
				}
			}
		}
		if (base == false) {
			System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		}
	}
}

