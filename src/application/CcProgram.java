package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class CcProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCorrente cc; 
		double deposito = 0.00;
		System.out.print("Enter account number: ");
		int Contacc = sc.nextInt();		
		sc.nextLine();	
		
		System.out.print("Enter account holder: ");
		String nomeCli = sc.nextLine();
		
		char teste;
		int i =0;
		System.out.print("Is there a initial deposit (y/n)? ");
		
		do {
			
			teste = sc.next().toLowerCase().charAt(0);
			
			i++;
			
			if (i > 2) {
				
				System.out.println("Please enter YES or NO!");
				i=0;
			}
		
		
		}while (teste != 'y' && teste != 'n');
		
		if (teste == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			 deposito = sc.nextDouble();
			 cc = new ContaCorrente(Contacc, nomeCli,deposito);
			
		} else{
			
			cc = new ContaCorrente(Contacc, nomeCli);
			
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(cc);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		deposito = sc.nextDouble();
		cc.deposit(deposito);
		System.out.println("Updated accout data:");
		System.out.println(cc);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		cc.withDraw(saque);
		System.out.println("Updated accout data:");
		System.out.println(cc);
		
			
		sc.close();

	}

}
