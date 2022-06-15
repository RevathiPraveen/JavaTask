package arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class OrderProcessor {

	ArrayList<Book> getOrderFromTheCustomer() {
		int bookCount;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count");
		bookCount = scan.nextInt();
		ArrayList<Book> bookList = new ArrayList<Book>();// created as booktype class
		Book object[] = new Book[bookCount];// directly given input bookcount
		for (int index = 0; index < bookCount; index++) {

			object[index] = getBookDataTheCustomer(bookCount);

			bookList.add(object[index]);

		}

		return bookList;// arraylist returned in booklisttype
	}

	Book getBookDataTheCustomer(int bookCount) {
		int id, quantity;
		String name, author, publisher;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the id");
		id = scan.nextInt();
		System.out.println("Enter the quantity");
		quantity = scan.nextInt();
		System.out.println("Enter the name");
		name = scan.next();
		System.out.println("Enter the author");
		author = scan.next();
		System.out.println("Enter the publisher");
		publisher = scan.next();

		Book object = new Book(id, quantity, name, author, publisher);

		return object;

	}

	void printOrderDetails(ArrayList<Book> bookList) {

		ArrayList<Book> temp = new ArrayList<Book>(bookList);

		java.util.Iterator<Book> itr = temp.iterator(); // as we create it for book class, we are using book here
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Book obook = (Book) itr.next();
			System.out.println(
					obook.id + " " + obook.quantity + " " + obook.name + " " + obook.author + " " + obook.publisher);
		}
	}
}
