class Patient
{
	String name;
	double height;
	double weight;

	double computeBMI(String n , double h ,double w)
	{
		name=n;
		height=h;
		weight=w;

		return weight/(height*height);
	}
}
public class Program3
{
	public static void main(String[] args)
	{
		Patient p=new Patient();
		System.out.print(p.computeBMI("sarthak",1.79832,84));
		
	}
}