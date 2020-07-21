package Assignment1;

class JDBCCalls{

	public static void main(String[] args) {
		try{
			DAOClass e = new DAOClass();
			int c = Integer.parseInt(args[0]);

			if(c == 1){
				e.insert(args);
			}
			else if(c == 2){
				e.delete(args);
			}
			else if(c == 3){
				e.modify(args);
			}
			else
				e.display(args);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
