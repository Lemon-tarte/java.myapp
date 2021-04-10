
public class AccountingAppArrayLoop {

	public static void main(String[] args) {
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = ValueOfSupply*vatRate;
		double Total = ValueOfSupply + VAT;
		double expenseRate = 0.3;
		double Expense = ValueOfSupply*expenseRate;
		double Income = ValueOfSupply - Expense;
		
		
		System.out.println("Value of supply : "+ValueOfSupply);
		System.out.println("VAT : "+ VAT);
		System.out.println("Total : "+ Total);
		System.out.println("Expense : "+Expense);
		System.out.println("Income : "+Income);
		

		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i = 0;
		while(i < dividendRates.length ) {
			System.out.println("Dividend "+ (i+1) + " : "+ Income * dividendRates[i]);
			i++;
		}
		
		
		
	}

}
