import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Gehalt: ");
		double gehalt = Double.valueOf(scanner.nextLine());

		double erh�hung = gehalt * 0.035;
		if (erh�hung < 150) {
			erh�hung = 150;
		}
		
		System.out.println("Das neue Gehalt ist " + (gehalt + erh�hung) + "�");
	}

}
