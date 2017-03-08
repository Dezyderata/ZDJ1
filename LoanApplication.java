import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.regex.*;

public class LoanApplication{
	private String firstName, surname;
	private String pesel, dateOfBirth;
	private String nip, bankAccountNumber;
	private String gender;
	private int plec;
	private int n;
	Scanner odczyt = new Scanner(System.in);
	public int getPlec(){
		System.out.println("Podaj plec klienta: 1-kobieta, 2-mezczyzna");
		plec = odczyt.nextInt();
		odczyt.nextLine();
		while(plec<1||plec>2){
			plec = 0;
			System.out.println("Cos poszlo nie tak, sprobuj jeszcze raz:");
			plec = odczyt.nextInt();
			odczyt.nextLine();
		}

		switch(plec){
			case 1:
				this.gender = "Kobieta";
				break;
			case 2:
				this.gender = "Mezczyzna";
				break;
		}
		return plec;
	}
	public String getFirstName(){
		System.out.println("Podaj imie klienta:");
		firstName = odczyt.nextLine();
		if(plec == 1){
			while(firstName.length()<=2 || !(firstName.matches("(^[A-Z])([a-z]*)(.[a])"))){
				firstName = "";
				System.out.println("Cos poszlo nie tak, sprobuj jeszcze raz:");
				firstName = odczyt.nextLine();
			}
		}
		else if(plec == 2){
			while(firstName.length()<=2 || !(firstName.matches("(^[A-Z])([a-z]*)(.[b-z])"))){
				firstName = "";
				System.out.println("Cos poszlo nie tak, sprobuj jeszcze raz:");
				firstName = odczyt.nextLine();
			}
		}
		return firstName;
	}

	public String getSurname(){
		System.out.println("Podaj nazwisko klienta:");
		surname = odczyt.nextLine();
		while(surname.length()<=2 || !(surname.matches("(^[A-Z])([a-z]*)"))){
			surname = "";
			System.out.println("Cos poszlo nie tak, sprobuj jeszcze raz:");
			surname = odczyt.nextLine();
		}
		return surname;
	}
	public String getPesel(){
		System.out.println("Podaj pesel klienta:");
		pesel = odczyt.nextLine();
		while(pesel.length()!=11 || !(pesel.matches("[0-9]*"))){
			pesel = "";
			System.out.println("Cos poszlo nie tak, sprobuj jeszcze raz:");
			pesel = odczyt.nextLine();
		}
		return pesel;
	}
	
	public String getbankAccountNumber(){
		System.out.println("Podaj numer rachunku bakowego klienta:");
		bankAccountNumber = odczyt.nextLine();
		while(bankAccountNumber.length()!=26 || !(bankAccountNumber.matches("[0-9]*"))){
			bankAccountNumber = "";
			System.out.println("Cos poszlo nie tak, sprobuj jeszcze raz:");
			bankAccountNumber = odczyt.nextLine();
		}
		return bankAccountNumber;
	}

	public String getNip(){
		System.out.println("Podaj nip klienta:");
		nip = odczyt.nextLine();
		while(nip.length()!=10 || !(nip.matches("[0-9]*"))){
			nip = "";
			System.out.println("Cos poszlo nie tak, sprobuj jeszcze raz:");
			nip = odczyt.nextLine();
		}
		return nip;
	}

	public void wypisz(){
		System.out.println("Imie to:" + firstName);
		System.out.println("Nazwisko to:" + surname);
		System.out.println("Pesel to:" + pesel);
		System.out.println("Nip to:" + nip);
		System.out.println("Konto bankowe to:" + bankAccountNumber);
		System.out.println("Plec to:" + gender);
	}
}
