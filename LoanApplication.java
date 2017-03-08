import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.regex.*;

public class LoanApplication{
	private String firstName, surname;
	private String pesel, dateOfBirth;
	private String nip, bankAccountNumber;
	private String gender;
	Scanner odczyt = new Scanner(System.in);
	public String getFirstName(){
		System.out.println("Podaj imie klienta:");
		firstName = odczyt.nextLine();
		while(firstName.length()<=2 || !(firstName.matches("^[A-Z].*"))|| !(firstName.matches(".[a-z]*"))){
			firstName = "";
			System.out.println("Cos poszlo nie tak, sprobuj jeszcze raz:");
			firstName = odczyt.nextLine();
		}
		return firstName;
	}

	public String getSurname(){
		System.out.println("Podaj nazwisko klienta:");
		surname = odczyt.nextLine();
		while(surname.length()<=2 || !(surname.matches("^[A-Z].*")) || !(surname.matches(".[a-z]*"))){
			surname = "";
			System.out.println("Cos poszlo nie tak, sprobuj jeszcze raz:");
			surname = odczyt.nextLine();
		}
		return surname;
	}
	public String getPesel(){
		System.out.println("Podaj pesel klienta:");
		pesel = odczyt.nextLine();
		while(pesel.length()<11 || pesel.length()>11 || !(pesel.matches("[0-9]*"))){
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
	public void wypisz(){
		System.out.println("Imie to:" + firstName);
		System.out.println("Nazwisko to:" + surname);
		System.out.println("Pesel to:" + pesel);
	}
}
