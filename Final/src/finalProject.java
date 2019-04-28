import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

/**
 * @author Joseph Kanauss
 *
 */
public class finalProject {
	protected Shell shlTheBookshelf;
	private Text titleText;
	////////////////////////////////////////////////////////////////////////////////////////
		//HANDWRITTEN CODE//
	static LinkedList<Book> myBookshelf = new LinkedList<Book>();
	static Queue<Book> myBookQueue = new LinkedList<Book>();
	
	static Book redPlanet = new Book("Red Planet", "Robert A. Heinlein", "Science Fiction", 1949, true);
	static Book hauntingHillHouse = new Book("The Haunting of Hill House", "Shirley Jackson", "Horror", 1959, true);
	static Book alwaysLivedCastle = new Book("We Have Always Lived in the Castle", "Shirley Jackson", "Fiction", 1962, true);
	static Book colorOfMagic = new Book("The Color of Magic", "Terry Pratchett", "Fantasy", 1983, true);
	static Book iAmLegend = new Book("I Am Legend", "Richard Matheson", "Horror", 1954, true);
	static Book redWall = new Book("Redwall", "Brian Jacques", "Fantasy", 1986, true);
	static Book flatland = new Book("Flatland", "Edwin A. Abbott", "Science Fiction", 1884, true);
	static Book taoOfPooh = new Book("The Tao of Pooh", "Benjamin Hoff", "Philosophy",1982, true);
	static Book breakfastOfChampions = new Book("Breakfast of Champions","Kurt Vonnegut, Jr.", "Fiction", 1973, true);
	static Book hitchhiker = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "Science Fiction", 1979, true);
	static Book yankee = new Book("A Connecticut Yankee in King Arthur's Court","Mark Twain","Fiction", 1889, true);
	static Book earthToMoon = new Book("From the Earth to the Moon","Jules Verne","Science Fiction", 1867, false);
	static Book journeyToCenter = new Book("Journey to the Center of the Earth","Jules Verne", "Science Fiction", 1864, false);
	static Book puddnhead = new Book ("Pudd'nhead Wilson", "Mark Twain", "Fiction", 1894, true);
	static Book huckFinn = new Book("The Adventures of Huckleberry Finn","Mark Twain", "Fiction", 1885, true);
	static Book highRise = new Book ("High Rise","JG Ballard", "Fiction", 1975, true);
	static Book chronopolis = new Book ("Chronopolis: the Science Fiction of JG Ballard","JG Ballard", "Science Fiction / Collection", 1971, false);
	static Book concreteIsland = new Book("Concrete Island","JG Ballard", "Fiction", 1973, true);
	static Book foodOfGods = new Book("The Food of the Gods","HG Wells", "Science Fiction", 1904, true);
	static Book whenSleeperWakes = new Book("When the Sleeper Wakes", "HG Wells","Science Fiction", 1899, true);
	static Book lurkingFear = new Book("The Lurking Fear and Other Stories", "HP Lovecraft", "Horror / Collection", 1971, true);
	static Book doomSarnath = new Book("The Doom That Came to Sarnath and Other Stories", "HP Lovecraft", "Horror / Collection", 1971, false);
	static Book strangeWine = new Book("Strange Wine","Harlan Ellison","Collection", 1979, true);
	static Book approachingOblivion = new Book("Approaching Oblivion", "Harlan Ellison","Fiction / Collection", 1976, true);
	static Book beastLove = new Book("The Beast That Shouted Love at the Heart of the World", "Harlan Ellison", "Fiction / Collection", 1974, true);
	static Book cavesSteel = new Book("The Caves of Steel", "Isaac Asimov", "Science Fiction", 1953, false);
	static Book bicentennial = new Book("The Bicentennial Man and Other Stories","Isaac Asimov", "Science Fiction / Collection", 1976, false);
	static Book robotsDawn = new Book("The Robots of Dawn", "Isaac Asimov","Science Fiction", 1983, false);
	static Book starDiaries = new Book("The Star Diaries","Stanislaw Lem","Science Fiction", 1971, false);
	static Book mortalEngines = new Book("Mortal Engines","Stanislaw Lem","Science Fiction", 1976, false);
	static Book morePirx = new Book("More Tales of Pirx the Pilot","Stanislaw Lem", "Science Fiction", 1982, false);
	static Book cyberiad = new Book("The Cyberiad","Stanislaw Lem","Science Fiction", 1972, false);
	static Book sherlockHolmes = new Book("Sherlock Holmes: the Complete Novels and Stories Vol.1","Sir Arthur Conan Doyle", "Mystery", 1887, false);
	static Book anansi = new Book("Anansi Boys","Neil Gaiman","Fantasy", 2005, true);
	static Book neverwhere = new Book("Neverwhere","Neil Gaiman", "Fantasy", 1996, false);
	static Book goodOmens = new Book("Good Omens","Neil Gaiman / Terry Pratchett", "Fantasy", 1990, true);
	static Book lostWorld = new Book("The Lost World", "Sir Arthur Conan Doyle", "Fantasy", 1912, false);
	static Book sherlockDracula = new Book("Sherlock Holmes vs Dracula", "Loren D. Estleman", "Mystery", 1978, false);
	static Book macbeth = new Book("Macbeth","William Shakespeare", "Play", 1606, true);
	static Book starHealer = new Book("Star Healer", "James White", "Science Fiction", 1984, true);
	static Book houseShudders = new Book("House Shudders", "Martin H. Greenberg / Charles C. Waugh", "Horror / Collection", 1987, true);
	static Book ambulanceShip = new Book("Ambulance Ship","James White", "Science Fiction", 1979, true);
	static Book hospitalStation = new Book("Hospital Station", "James White", "Science Fiction", 1962, true);
	static Book sectorGeneral = new Book("Sector General","James White", "Science Fiction", 1983, true);
	static Book codeBlue = new Book("Code Blue - Emergency","James White", "Science Fiction", 1987, true);
	static Book genocidalHealer = new Book("The Genocidal Healer","James White", "Science Fiction", 1991, true);
	static Book asYouLikeIt = new Book("As You Like It", "William Shakespeare", "Play", 1623, true);
	static Book comedyOfErrors = new Book("The Comedy of Errors","William Shakespeare","Play", 1594, true);
	static Book hamlet = new Book("Hamlet","William Shakespeare", "Play", 1599, true);
	static Book tamingShrew = new Book("The Taming of the Shrew","William Shakespeare","Play", 1590, true);
	static Book midsummer = new Book("A Midsummer Night's Dream","William Shakespeare","Play", 1595, true);
	static Book muchAdo = new Book("Much Ado About Nothing","William Shakespeare", "Play", 1598, true);
	static Book lifeBoat = new Book("Lifeboat", "James White", "Science Fiction", 1972, false);
	static Book timesWithoutNumber = new Book("Times Without Number", "John Brunner", "Science Fiction", 1969, false);
	static Book zanzibar = new Book("Stand on Zanzibar","John Brunner", "Science Fiction", 1968, false);
	static Book sheepLookUp = new Book("The Sheep Look Up","John Brunner", "Science Fiction", 1972, false);
	static Book shockwaveRider = new Book("The Shockwave Rider","John Brunner","Science Fiction", 1975, false);
	static Book squaresCity = new Book("The Squares of the City","John Brunner", "Science Fiction", 1965, false);
	static Book variableStar = new Book("Variable Star", "Robert A. Heinlein / Spider Robinson", "Science Fiction", 2006, true);
	static Book timePressure = new Book("Time Pressure","Spider Robinson", "Science Fiction",1987, true);
	static Book mindkiller = new Book("Mindkiller","Spider Robinson","Science Fiction", 1982, true);
	static Book stardance = new Book("Stardance","Spider Robinson / Jeanne Robinson", "Science Fiction", 1977, true);
	static Book nightOfPower = new Book("Night of Power","Spider Robinson","Science Fiction", 1985, true);
	static Book byName = new Book("By Any Other Name","Spider Robinson", "Science Fiction / Collection", 2001, false);
	static Book starmind = new Book("Starmind","Spider Robinson / Jeanne Robinson", "Science Fiction", 1995, false);
	static Book freeLunch = new Book("The Free Lunch","Spider Robinson","Science Fiction", 2001, true);
	static Book melancholy =  new Book("Melancholy Elephants","Spider Robinson", "Science Fiction / Collection", 1985, true);
	static Book antinomy = new Book("Antinomy","Spider Robinson", "Science Fiction / Collection", 1980, true);
	static Book telempath = new Book("Telempath", "Spider Robinson", "Science Fiction", 1976, true);
	static Book starseed = new Book("Starseed","Spider Robinson / Jeanne Robinson","Science Fiction",1991, true);
	static Book makeRoom = new Book("Make Room! Make Room!","Harry Harrison","Science Fiction",1966, true);
	
	
//Add the books to the bookshelf
	/**
	 * Fill the bookshelf with created book objects and sort the bookshelf
	 */
	public static void fillBookshelf() {
		myBookshelf.add(redPlanet);
		myBookshelf.add(hauntingHillHouse);
		myBookshelf.add(alwaysLivedCastle);
		myBookshelf.add(colorOfMagic);
		myBookshelf.add(iAmLegend);
		myBookshelf.add(redWall);
		myBookshelf.add(flatland);
		myBookshelf.add(taoOfPooh);
		myBookshelf.add(breakfastOfChampions);
		myBookshelf.add(hitchhiker);
		myBookshelf.add(yankee);
		myBookshelf.add(earthToMoon);
		myBookshelf.add(journeyToCenter);
		myBookshelf.add(puddnhead);
		myBookshelf.add(huckFinn);
		myBookshelf.add(highRise);
		myBookshelf.add(chronopolis);
		myBookshelf.add(concreteIsland);
		myBookshelf.add(foodOfGods);
		myBookshelf.add(whenSleeperWakes);
		myBookshelf.add(lurkingFear);
		myBookshelf.add(doomSarnath);
		myBookshelf.add(strangeWine);
		myBookshelf.add(approachingOblivion);
		myBookshelf.add(beastLove);
		myBookshelf.add(cavesSteel);
		myBookshelf.add(bicentennial);
		myBookshelf.add(robotsDawn);
		myBookshelf.add(starDiaries);
		myBookshelf.add(mortalEngines);
		myBookshelf.add(morePirx);
		myBookshelf.add(cyberiad);
		myBookshelf.add(sherlockHolmes);
		myBookshelf.add(anansi);
		myBookshelf.add(neverwhere);
		myBookshelf.add(goodOmens);
		myBookshelf.add(lostWorld);
		myBookshelf.add(sherlockDracula);
		myBookshelf.add(macbeth);
		myBookshelf.add(starHealer);
		myBookshelf.add(houseShudders);
		myBookshelf.add(ambulanceShip);
		myBookshelf.add(hospitalStation);
		myBookshelf.add(sectorGeneral);
		myBookshelf.add(codeBlue);
		myBookshelf.add(genocidalHealer);
		myBookshelf.add(asYouLikeIt);
		myBookshelf.add(comedyOfErrors);
		myBookshelf.add(hamlet);
		myBookshelf.add(tamingShrew);
		myBookshelf.add(midsummer);
		myBookshelf.add(muchAdo);
		myBookshelf.add(lifeBoat);
		myBookshelf.add(timesWithoutNumber);
		myBookshelf.add(zanzibar);
		myBookshelf.add(sheepLookUp);
		myBookshelf.add(shockwaveRider);
		myBookshelf.add(squaresCity);
		myBookshelf.add(variableStar);
		myBookshelf.add(timePressure);
		myBookshelf.add(mindkiller);
		myBookshelf.add(stardance);
		myBookshelf.add(nightOfPower);
		myBookshelf.add(byName);
		myBookshelf.add(starmind);
		myBookshelf.add(freeLunch);
		myBookshelf.add(melancholy);
		myBookshelf.add(antinomy);
		myBookshelf.add(telempath);
		myBookshelf.add(starseed);
		myBookshelf.add(makeRoom);
		
		
		//Sort the bookshelf alphabetically by Title property
		Collections.sort(myBookshelf, Book.BookTitleCompare);
	
	}
	///////////////////////////////////////////////////////////////////////////////////////
	private Text authorText;
	private Text genreText;
	private Text pubDateText;
	

	/**
	 * Launch the application.
	 * @param args
	 */
	
	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////////////////////////
		fillBookshelf();
		////////////////////////////////////////////////////////////////////////////////////////
		try {
			finalProject window = new finalProject();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlTheBookshelf.open();
		shlTheBookshelf.layout();
		while (!shlTheBookshelf.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////////
		//Search by functions for properties
			boolean searchByTitle(String titleToFind, Book bookToSearch) {
				boolean found = false;
				if(bookToSearch.getTitle().toLowerCase().contains(titleToFind.toLowerCase())) {
					found = true;
				}
				return found;
			}
			boolean searchByAuthor(String authorToFind, Book bookToSearch) {
				boolean found = false;
				if(bookToSearch.getAuthor().toLowerCase().contains(authorToFind.toLowerCase())) {
					found = true;
				}
				return found;
			}
			boolean searchByGenre(String genreToFind, Book bookToSearch) {
				boolean found = false;
				if(bookToSearch.getGenre().toLowerCase().contains(genreToFind.toLowerCase())) {
					found = true;
				}
				return found;
			}
			boolean searchByPubDate(String pubDateToFind, Book bookToSearch) {
				boolean found = false;
				if(Integer.toString(bookToSearch.getPubDate()).contains(pubDateToFind)) {
					found = true;
				}
				return found;
			}
			boolean searchByReadStatus(boolean readStatus, Book bookToSearch) {
				boolean found = false;
				if ((bookToSearch.isHaveRead() && readStatus) || (!bookToSearch.isHaveRead() && !readStatus)) {
					found = true;
				}
				return found;
			}
////////////////////////////////////////////////////////////////////////////////////////
//			void showBox(String msg, String title) {
//				
//			}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlTheBookshelf = new Shell();
		shlTheBookshelf.setImage(null);
		shlTheBookshelf.setSize(780, 387);
		shlTheBookshelf.setText("The Bookshelf");
		
		Label TitleLabel = new Label(shlTheBookshelf, SWT.NONE);
		TitleLabel.setBounds(71, 35, 29, 15);
		TitleLabel.setText("Title: ");
		
		titleText = new Text(shlTheBookshelf, SWT.BORDER);
		titleText.setBounds(106, 32, 136, 21);
		
		Label authorLabel = new Label(shlTheBookshelf, SWT.NONE);
		authorLabel.setText("Author:");
		authorLabel.setBounds(58, 76, 42, 15);
		
		authorText = new Text(shlTheBookshelf, SWT.BORDER);
		authorText.setBounds(106, 73, 136, 21);
		
		Label genreLabel = new Label(shlTheBookshelf, SWT.NONE);
		genreLabel.setText("Genre:");
		genreLabel.setBounds(66, 119, 34, 15);
		
		genreText = new Text(shlTheBookshelf, SWT.BORDER);
		genreText.setBounds(106, 116, 136, 21);
		
		Label pubDateLabel = new Label(shlTheBookshelf, SWT.NONE);
		pubDateLabel.setText("Publication Date:");
		pubDateLabel.setBounds(10, 158, 90, 15);
		
		pubDateText = new Text(shlTheBookshelf, SWT.BORDER);
		pubDateText.setBounds(106, 155, 136, 21);
		
		Label readStatusLabel = new Label(shlTheBookshelf, SWT.NONE);
		readStatusLabel.setText("Read Status:");
		readStatusLabel.setBounds(36, 196, 64, 15);

		Label errorLabel = new Label(shlTheBookshelf, SWT.NONE);
		errorLabel.setForeground(SWTResourceManager.getColor(204, 0, 0));
		errorLabel.setAlignment(SWT.CENTER);
		errorLabel.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.ITALIC));
		errorLabel.setBounds(383, 284, 361, 34);List bookList = new List(shlTheBookshelf, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		
////////////////////////////////////////////////////////////////////////////////////////
//LISTBOX ITEM SELECTION EVENT HANDLER : when book in listbox is clicked, a dialogue box pops up with the properties of that book
		bookList.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String itemTitle = bookList.getItem(bookList.getSelectionIndex());
				for(Book book : myBookshelf)
				{	
					if(itemTitle.compareTo(book.getTitle()) == 0) {
						 Book bookToDisplay = book;
						 String bookToDisplayTitle = book.getTitle();
						 String msg = "Title: "+bookToDisplay.getTitle() + "\nAuthor: "+bookToDisplay.getAuthor() + "\nGenre: "+bookToDisplay.getGenre() + "\nPublication Date: " + bookToDisplay.getPubDate() + "";	
						 JOptionPane.showMessageDialog(null, msg, bookToDisplayTitle, 1);
					}
				}
			}
		});
////////////////////////////////////////////////////////////////////////////////////////
		bookList.setBounds(383, 31, 361, 247);
		
		Button haveReadStatus = new Button(shlTheBookshelf, SWT.RADIO);
		haveReadStatus.setBounds(135, 195, 75, 16);
		haveReadStatus.setText("Have Read");
		
		Button notReadStatus = new Button(shlTheBookshelf, SWT.RADIO);
		notReadStatus.setBounds(135, 217, 64, 16);
		notReadStatus.setText("Not Read");
		
		
		Button titleCheck = new Button(shlTheBookshelf, SWT.CHECK);
		titleCheck.setBounds(248, 34, 93, 16);
		titleCheck.setText("Include Title");
		
		Button authorCheck = new Button(shlTheBookshelf, SWT.CHECK);
		authorCheck.setBounds(249, 75, 100, 16);
		authorCheck.setText("Include Author");
		
		Button genreCheck = new Button(shlTheBookshelf, SWT.CHECK);
		genreCheck.setBounds(249, 118, 93, 16);
		genreCheck.setText("Include Genre");
		
		Button pubDateCheck = new Button(shlTheBookshelf, SWT.CHECK);
		pubDateCheck.setBounds(248, 158, 114, 16);
		pubDateCheck.setText("Include Pub. Date");
		
		Button readStatusCheck = new Button(shlTheBookshelf, SWT.CHECK);
		readStatusCheck.setBounds(249, 195, 128, 16);
		readStatusCheck.setText("Include Read Status");
	
		
		Button displayButton = new Button(shlTheBookshelf, SWT.NONE);
		displayButton.addMouseListener(new MouseAdapter() {
			@Override
////////////////////////////////////////////////////////////////////////////////////////	
//SEARCH BUTTON FUNCTIONALITY : Each book in the bookshelf is popped from the linked list and examined. 
//If the book's properties match with the checked user inputed properties, that book is added to the bookList  
			public void mouseUp(MouseEvent e) {
				errorLabel.setText("");
				bookList.removeAll();
				while(myBookshelf.size() > 0) {
					boolean includeBook = false;
					Book currentBook = myBookshelf.pop();
					if(titleCheck.getSelection())
					{
						if(searchByTitle(titleText.getText(), currentBook)) {
							includeBook = true;
						}
						else {
							continue;
						}
					}
					if(authorCheck.getSelection())
					{
						if(searchByAuthor(authorText.getText(), currentBook)) {
							includeBook = true;
						}
						else {
							continue;
						}
					}
					
					if(genreCheck.getSelection())
					{
						if(searchByGenre(genreText.getText(), currentBook)) {
							includeBook = true;
						}
						else {
							continue;
						}
					}
					
					if(pubDateCheck.getSelection())
					{
						if(searchByPubDate(pubDateText.getText(), currentBook)) {
							includeBook = true;
						}
						else {
							continue;
						}
					}
					
					if(readStatusCheck.getSelection())
					{
						if(haveReadStatus.getSelection()) {
							if(searchByReadStatus(true, currentBook)) {
								includeBook = true;
							}
							else {
								continue;
							}
						}
						else if(notReadStatus.getSelection()) {
							if(searchByReadStatus(false, currentBook)) {
								includeBook = true;
							}
							else {
								continue;
							}
						}
						else {
							errorLabel.setText("Please select a Read Status");
						}
					}
					
					if(!titleCheck.getSelection() && !authorCheck.getSelection() && !genreCheck.getSelection() && !pubDateCheck.getSelection() && !readStatusCheck.getSelection()) {
						errorLabel.setText("Please include at least 1 property to search by");
					}
					
					if(includeBook)
					{
						myBookQueue.add(currentBook);
						bookList.add(currentBook.getTitle());
					}
					}
				
				fillBookshelf();
			}
		});
////////////////////////////////////////////////////////////////////////////////////////		
		
		displayButton.setBounds(58, 253, 75, 25);
		displayButton.setText("Search");
		
		Button resetFormButton = new Button(shlTheBookshelf, SWT.NONE);
		resetFormButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				titleText.setText("");
				titleCheck.setSelection(false);
				authorText.setText("");
				authorCheck.setSelection(false);
				genreText.setText("");				genreCheck.setSelection(false);
				pubDateText.setText("");
				pubDateCheck.setSelection(false);
				haveReadStatus.setSelection(false);
				notReadStatus.setSelection(false);
				readStatusCheck.setSelection(false);
			}
		});
		resetFormButton.setText("Reset");
		resetFormButton.setBounds(139, 253, 75, 25);
		
		Button exitButton = new Button(shlTheBookshelf, SWT.NONE);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				System.exit(0);
			}
		});
		exitButton.setText("Exit");
		exitButton.setBounds(220, 253, 75, 25);
		

		
		
		
		
		
		
		
		
		

	}
}
