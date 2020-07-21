class Box
{
	double length;
	double width;
	double height;
	Box(double l,double w ,double h)
	{
		length=l;
		width=w;
		height=h;
	}

	double volume()
	{
		return length*width*height;
	}
}

public class Program1{
	public static void main(String[] args)
	{
		Box b=new Box(10,20,30);
		System.out.println(b.volume());
	}
}