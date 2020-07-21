import java.awt.List;
import java.util.ArrayList;

class MyArrayList<E> extends ArrayList<E> {
		@Override
		public boolean add(E e) {
			if (e instanceof Integer || e instanceof Float || e instanceof Double) {
				super.add(e);
				return true;
			} else {
				throw new ClassCastException("Only Integer, Float, and Double are acceptable.");
			}
		}
	}
public class Program4 {
	public static void main(String[] args) {
			MyArrayList<Object> list = new MyArrayList<>();
			
			try {
				list.add(15);
				list.add(1.2);
				list.add(10.415D);
				list.add("sarthak");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(list);

		}

}
