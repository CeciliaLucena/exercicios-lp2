import java.util.Scanner;
public class DobroTriplo {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = X * 2;
		int Z = X * 3;
		System.out.println("dobro: " + Y + ", triplo: " + Z);
	}
}
