import java.util.Scanner;
public class MaisQue7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		float media = ((x + y) / 2);
		if (media >= 7.0) {
			System.out.println("pass: True!");
		} else {
			System.out.println("pass: False!");
		}
	}
}
