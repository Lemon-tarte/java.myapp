class Accounting{
	
	public double ValueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : "+ ValueOfSupply);
		System.out.println("VAT : "+  getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend 1 : "+getDividend1());
		System.out.println("Dividend 2 : "+getDividend2());
		System.out.println("Dividend 3 : "+getDividend3());
		System.out.println("==========");
	}
	private double getDividend1() {
		return  getIncome() * 0.5;
	}
	private double getDividend2() {
		return  getIncome() * 0.3;
	}
	private double getDividend3() {
		return getIncome() * 0.2;
	}
	private double getIncome() {
		return ValueOfSupply - getExpense();
	}
	private double getExpense() {
		return ValueOfSupply*expenseRate;
	}
	private double getTotal() {
		return  ValueOfSupply + getVAT();
	}
	private double getVAT() {
		return ValueOfSupply*vatRate;
	}
}


public class AccountingClassApp {
	
	public static void main(String[] args) {
		

		Accounting a1 = new Accounting();
		a1.ValueOfSupply = Double.parseDouble(args[0]);
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.ValueOfSupply = Double.parseDouble(args[0]);
		a2.vatRate = 0.05;
		a2.expenseRate = 0.4;
		a2.print();
		
		a1.print();
	}
		
}
