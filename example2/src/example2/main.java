package example2;

import java.util.Scanner;

import bank.Account;
import bank.LimitAccount;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Integer option = -1;
		Account account = null;
		//LimitAccount accountLimit;
		System.out.println("1.- Crear Cuenta  ");
		System.out.println("2.- Crear Cuenta Limitada  ");
		String optionAccount = read.nextLine();
		if (optionAccount.equals("1")) {
			System.out.println("Con cuanto saldo desea crear su cuenta  ");
			String balance = read.nextLine();
			Double balanceDouble = Double.parseDouble(balance);
			account = new Account(balanceDouble);
		} else{
			System.out.println("Con cuanto saldo desea crear su cuenta  ");
			String balance = read.nextLine();
			Double balanceDouble = Double.parseDouble(balance);
			account = new LimitAccount(balanceDouble);
		}
		do {
			
			
			System.out.println("1.- Agregar saldo");
			System.out.println("2.- Retirar Dinero  ");
			System.out.println("3.- Mostrar saldo");
			System.out.println("4.- Salir del programa  ");
			String inputData = read.nextLine();
			try {
				option = Integer.parseInt(inputData);
				switch  (option) {
				case 1: {
					System.out.println("Con cuanto dinero desea agregar ");
					String balance = read.nextLine();
					Double balanceDouble = Double.parseDouble(balance);
					account.add(balanceDouble);
					System.out.println("Tu saldo es " + account.getBalance());
					break;
				}
				case 2 : {
					System.out.println("Cuanto dinero desea retirar  ");
					String balance = read.nextLine();
					Double balanceDouble = Double.parseDouble(balance);
					account.subtract(balanceDouble);
					System.out.println("Tu saldo es " + account.getBalance());
					break;
				}
				case 3 : {
					System.out.println("Tu saldo es " + account.getBalance());
					break;
				}
				}
			} catch (Error e) {
				System.out.println("No se deben introducir numeros enteros");
			}
			
		} while (option != 4) ;
		System.out.println("Bye! ");
	}

}
