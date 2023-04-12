package edu.monmouth.book;
public class Book {
	private int id;
	private double price;
	private String title;
	private BookTypes bookType;

	public Book(int id, double price, String title, BookTypes bookType) throws BookException {
		if (id < 0 || price < 0 || title.isEmpty()) {
			throw new BookException("Invalid book details");
		}

		this.id = id;
		this.price = price;
		this.title = title;
		this.bookType = bookType;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public BookTypes getBookType() {
		return bookType;
	}

	@Override
	public String toString() {
		String bookTypeInfo = "";

		switch (bookType) {
		case HARDBACK:
			bookTypeInfo = "Hardback";
			break;
		case SOFTBACK:
			bookTypeInfo = "Softback";
			break;
		default:
			break;
		}

		return String.format("%d, $%.2f, %s, %s", id, price, title, bookTypeInfo);
	}
}


