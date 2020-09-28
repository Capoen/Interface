package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double toatlValue = sc.nextDouble();

		Contract contract = new Contract(number, date, toatlValue);

		System.out.print("Enter the number of installments: ");
		Integer N = sc.nextInt();

		ContractService cs = new ContractService(new PayPalService());
		cs.processContract(contract, N);

		System.out.println("INSTALLMENTS:");
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
		}

		sc.close();
	}

}
