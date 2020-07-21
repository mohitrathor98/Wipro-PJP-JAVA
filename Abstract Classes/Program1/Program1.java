package Program1;

public class Program1 {
	public static void main(String[] args)
	{
		ICICIBank i =new ICICIBank();
		KotMBank k =new KotMBank();
		GeneralBank g1=new KotMBank();
		GeneralBank g2=new ICICIBank();
		
		System.out.println(i.getSavingsInterestRate());
		System.out.println(i.getFixedDepositInterestRate());
		System.out.println(k.getSavingsInterestRate());
		System.out.println(k.getFixedDepositInterestRate());
		
		System.out.println("");
		
		System.out.println(g2.getSavingsInterestRate());
		System.out.println(g2.getFixedDepositInterestRate());
		System.out.println(g1.getSavingsInterestRate());
		System.out.println(g1.getFixedDepositInterestRate());
		
	}
}
