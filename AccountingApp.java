
public class AccountingApp {

	public static void main(String[] args) {
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = ValueOfSupply*vatRate;
		double Total = ValueOfSupply + VAT;
		double expenseRate = 0.3;
		double Expense = ValueOfSupply*expenseRate;
		double Income = ValueOfSupply - Expense;
		double dividend1 = Income * 0.5;
		double dividend2 = Income * 0.3;
		double dividend3 = Income * 0.2;
		
		
		System.out.println("Value of supply : "+ValueOfSupply);
		System.out.println("VAT : "+ VAT);
		System.out.println("Total : "+ Total);
		System.out.println("Expense : "+Expense);
		System.out.println("Income : "+Income);
		System.out.println("Dividend 1 : "+dividend1);
		System.out.println("Dividend 2 : "+dividend2);
		System.out.println("Dividend 3 : "+dividend3);
		
		
		
	}

}
