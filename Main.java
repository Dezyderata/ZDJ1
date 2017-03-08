import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String[] args){
		Scanner odczyt = new Scanner(System.in);
		int n;
		System.out.println("Ilu klientow chcesz wpisac:");
		n = odczyt.nextInt();
		LoanApplication klient = new LoanApplication();
		klient.getFirstName();
		klient.getSurname();
		klient.getPesel();
		klient.getbankAccountNumber();
		klient.wypisz();
	}
}
