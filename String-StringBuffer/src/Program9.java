
public class Program9 {
	public static void main(String[] args)
	{
		String a="hello";
		String b="world";
		
		StringBuffer sb=new StringBuffer();
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				sb.append(a.charAt(i)).append(b.charAt(i));
			}
			System.out.print(sb);
		}
		else if(a.length() > b.length())
		{
			for(int i=0;i<b.length();i++)
			{
				sb.append(a.charAt(i)).append(b.charAt(i));
			}
			sb.append(a.substring(b.length(),a.length()));
			System.out.print(sb);
		}
		else
		{
			for(int i=0;i<a.length();i++)
			{
				sb.append(a.charAt(i)).append(b.charAt(i));
			}
			sb.append(b.substring(a.length(),b.length()));
			System.out.print(sb);
		}
	
		
	}
}
