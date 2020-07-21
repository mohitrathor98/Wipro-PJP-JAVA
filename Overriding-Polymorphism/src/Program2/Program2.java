package Program2;

public class Program2 {
	public static void main(String[] args)
	{
		Shape circle=new Circle();
		circle.Draw();
		circle.Erase();
		
		Shape triangle=new Triangle();
		triangle.Draw();
		triangle.Erase();
		
		Shape square=new Square();
		square.Draw();
		square.Erase();
	}
}
