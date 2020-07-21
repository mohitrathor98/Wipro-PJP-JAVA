package Program4;

public class Program4 {
	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("sarthak", 84393218);
		contactsList.addContact("rishabh", 98975595);
		
				
		System.out.println("Sarthak: " + contactsList.doesContactNameExist("sarthak"));
		System.out.println("989754495: " + contactsList.doesContactNumberExist(989754495));
		
		System.out.println();
		contactsList.listAllContacts();
	}
}
