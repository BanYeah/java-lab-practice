enum States {Borrowed, Returned};

public class Library {
	private Book[] books;
	
	// constructor
	Library() {
		books = new Book[10]; // total 10 books
		for (int i = 0; i < 10; i++)
			books[i] = new Book();
	}
	
	// member methods
	public void borrowing(int n) {
		if (books[n].state == States.Borrowed)
			System.out.printf("[error] %dth book is already borrowed!\n", n);
		else {
			books[n].state = States.Borrowed;
			System.out.printf("You borrowed %dth book.\n", n);
		}
	}
	
	public void returning(int n) {
		if (books[n].state == States.Returned)
			System.out.printf("[error] %dth book is already returned!\n",n);
		else {
			books[n].state = States.Returned;
			System.out.printf("You returned %dth book.\n", n);
		}
	}
	
//	public static void main(String[] args) {
//		Library library = new Library();
//		
//		library.borrowing(0);
//		library.returning(0);
//		
//		library.borrowing(9);
//		library.borrowing(9);
//		library.returning(6);
//		
//		return;
//	}
}

class Book {
	States state;
	
	// constructor
	Book() {
		state = States.Returned;
	}
}