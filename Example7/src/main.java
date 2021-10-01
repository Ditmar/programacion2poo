import java.util.Scanner;

import accountmanagement.Account;
import accountmanagement.LimitAccount;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				Integer option = -1;
				System.out.println("1.-) Crear Cuenta Normal");
				System.out.println("2.-) Crear Cuenta Limitada");
				option = Integer.parseInt(scanner.nextLine());
				Account account = null;
				if (option == 1) {
					account = new Account(0.0);
					System.out.println("Creo una tipo de cuenta normal");
				} else {
					account = new LimitAccount(0.0);
					System.out.println("Creo una cuenta limitada");
				}
				
				do {
					System.out.println("1.-) Agregar saldo");
					System.out.println("2.-) Extraer Dinero");
					System.out.println("3.-) Mostrar");
					System.out.println("4.-) Mostrar extracto");
					System.out.println("5.-) Salir");
					
					option = Integer.parseInt(scanner.nextLine());
					switch (option) {
						case 1 : {
							System.out.println("Agregue el saldo inicial");
							Double balance =  Double.parseDouble(scanner.nextLine());
							System.out.println(balance);
							account.addBalance(balance);
							break;
						}
						case 2 : {
							System.out.println("Cuanto desea retirar");
							Double money =  Double.parseDouble(scanner.nextLine());
							account.extractBalance(money);
							break;
						}
						case 3 : {
							System.out.println(account.getBalance());			
							break;
						}
						case 4 : {
							account.showExtract();
							break;
						}
					}
					
				} while (option != 5);
	}

}
