package arraylist;
import java.util.ArrayList;
public class Book_storerunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderProcessor object = new OrderProcessor();
		ArrayList<Book>temp = new ArrayList<Book>(object.getOrderFromTheCustomer());
		//creating class type to store objects of book class
		object.printOrderDetails(temp);
	}

}
