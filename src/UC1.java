class AddBook
{
	String fn;
	String ln;
	String add;
	String ct;
	String st;
	int zip;
	long pn;
	
	String email;
	void data(String fn, String ln, String add, String ct, String st, int zip, long pn, String email)
	{
		System.out.print("First Name: "+ fn +"\n Last Name: "+ ln);
		System.out.print("\n Address: "+ add + " City: "+ ct + " State: " + st + "\n ZipCode: " + zip + "\n PhoneNo: " + pn + "\n Email: " + email);
	}
}
public class UC1 {

	public static void main(String[] args) {
		AddBook person1 = new AddBook();
		person1.data("Chandrakant", "Prasad", "PG", "Bangalore", "Karnataka", 560059, 7001950699L, "chandrakant@gmail.com" );

	}

}
