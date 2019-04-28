import java.util.Comparator;

/**
 * @author Joseph Kanauss
 *
 */
public class Book {
	private String title;
	private String author;
	private String genre;
	private int pubDate;
	private boolean haveRead;
	
	/**
	 * Default constructor
	 */
	public Book() {
		super();
	}

	/**
	 * @param title
	 * @param author
	 * @param genre
	 * @param pubDate
	 * @param haveRead
	 * parameterized constructor
	 */
	public Book(String title, String author, String genre, int pubDate, boolean haveRead) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pubDate = pubDate;
		this.haveRead = haveRead;
	}

	/**
	 * @return
	 * Get the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 * Set the title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return
	 * Get the author name
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 * Set the author name
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return
	 * Get the genre 
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre
	 * Set the genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return
	 * Get the publication date
	 */
	public int getPubDate() {
		return pubDate;
	}

	/**
	 * @param pubDate
	 * Set the publication name
	 */
	public void setPubDate(int pubDate) {
		this.pubDate = pubDate;
	}

	/**
	 * @return
	 * Get the read status
	 */
	public boolean isHaveRead() {
		return haveRead;
	}

	/**
	 * @param haveRead
	 * Set the read status
	 */
	public void setHaveRead(boolean haveRead) {
		this.haveRead = haveRead;
	}

	@Override
	public String toString() {
		return "TITLE: " + title + "\nAUTHOR: " + author + "\nGENRE: " + genre + "\nPUBLICATION DATE: " + pubDate
				+ "\nREAD STATUS: " + isHaveRead();
	}
	
	//Comparator uses the the titles of the books and compares them, allowing them to be sorted in the collections.sort function in the main program
	/**
	 * Comparator sort based on book title
	 */
	public static Comparator<Book> BookTitleCompare = new Comparator<Book>() {
		public int compare(Book title1, Book title2) {
			String titlea = title1.getTitle();
			String titleb = title2.getTitle();
			return titlea.compareTo(titleb);
		}
	};
	
	
}
