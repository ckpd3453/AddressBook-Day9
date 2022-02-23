import java.util.ArrayList;
import java.util.Scanner;

class AddBook
{
	
	void dataAdd()
	{
		 
		try(Scanner scanner = new Scanner(System.in))
		{
			ArrayList<String> contacts = new ArrayList<String>();
			
			System.out.print("Enter First Name: ");
			String fn =scanner.nextLine();
			contacts.add(fn);
			
		
			System.out.print("Enter Last Name: ");
			String ln =scanner.nextLine();
			contacts.add(ln);
			
			
			System.out.print("Enter Address: ");
			String add =scanner.nextLine();
			contacts.add(add);
	
			
			System.out.print("Enter City: ");
			String ct =scanner.nextLine();
			contacts.add(ct);
			
			
			System.out.print("Enter State: ");
			String st =scanner.nextLine();
			contacts.add(st);
			
			
			System.out.print("Enter Zip Code: ");
			String zip = scanner.nextLine();
			contacts.add(zip);
			
			
			System.out.print("Enter Phone No: ");
			String pn =scanner.nextLine();
			contacts.add(pn);
			
			
			System.out.print("Enter Email: ");
			String email =scanner.nextLine();
			contacts.add(email);
			
			System.out.println("Contact Added");
			System.out.println(contacts);
			
			System.out.println("Enter the first name of contact you want to edit :");
			String fn1= scanner.nextLine();
			
			
			if (fn1 .equals(fn) )
			{
				dataAdd();
			}
			else
			{
				System.out.println("NO contact exists by this name");
			}

			System.out.println("Edited Contacts: "+contacts);
			
			
		}
	}
}

public class UC3 {

	public static void main(String[] args) {
		System.out.println("PhoneBook");
		AddBook person1 = new AddBook();
		person1.dataAdd();
	}

}
