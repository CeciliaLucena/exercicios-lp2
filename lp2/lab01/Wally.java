import java.util.Scanner;

public class Wally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String input = sc.nextLine();
			if ("wally".equals(input)) {
				break;
			}
			String[] nomes = input.split(" ");
			String e = "?";
			
			for (int i = 0; i < nomes.length; i++) {
				if (nomes[i].length() == 5) { 
					e = nomes[i];
				}
			}
			System.out.println(e);
		}
	}
}
