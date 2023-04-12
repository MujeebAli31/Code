
package edu.monmouth.hw4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import edu.monmouth.book.*;
public class BookHW4 {
	public static void main(String args[]) {
		// validate 2 command line arguments are passed in
		if(args.length!=2) {
			System.err.println("Please provide two command line arguments, either the data file or the output file");
			System.exit(1);
		}
		// first argument is the name of the data file
		String booksHW4= args[0];
		// second argument is the name of the file to which stdout & stderr are redirected
		String HW4Output=args[1];
		// redirect stdout & stderr to specified file
		try {
			PrintStream logStream = new PrintStream(HW4Output);
			System.setOut(logStream);
			System.setErr(logStream);
		} catch (FileNotFoundException e) {
			System.err.println("Failed to redirect");
			e.printStackTrace();
			System.exit(1);
		}
		
		// create a HashSet that contains Book objects (name it bookSet)
		HashSet<Book>bookSet=new HashSet<Book>();
		// open and read the data file, creating Book objects (if valid)
		try 
		{
			Scanner dataFileScanner = new Scanner(new File(booksHW4));
		  while (dataFileScanner.hasNextLine()) {
			  String fileL = dataFileScanner.nextLine();
			  String[] variety = fileL.split(",");
			  if (variety.length==4) {
				  String title = variety[0];
				  BookTypes booktype = BookTypes.valueOf(variety[1]);
				  int numberOfPages = Integer.parseInt(variety[2]);
				  double price = Double.parseDouble(variety[3]);
				  try {
					  Book book = new Book(numberOfPages, price, title, booktype);
					  if (bookSet.add(book)) 
					  {
						  System.out.println("Successfully added book to HashSet: " + book);
						  } 
					  else
					  {
						  System.out.println("Book already exists in HashSet: " + book);
                      }
				  }
				  catch (BookException e) {
					  System.err.println("Error creating Book object from line '" + fileL + "': " + e.getMessage());
				}
              } 
			  else 
			  {
                  System.err.println("Error parsing line '" + fileL + "' in data file");
              }
          }
          dataFileScanner.close();
      } 
	catch (FileNotFoundException e) 
	{
          System.err.println("Error: cannot open data file " + booksHW4);
          System.exit(1);
      }
		// after data file is read and valid Book objects added to Hashset iterate over HashSet
		// printing each Book object 
	        for (Book book : bookSet) {
	            System.out.println(book);
	        }		
		// determine if the following 2 books are in the HashSet
		Book bookToFind = null;
		try {
			bookToFind = new Book(829, 23.95, "The Soloman Curse", BookTypes.HARDBACK);
			if(bookSet.contains(bookToFind)== true) {
				System.out.println(bookToFind + "Exists in bookSet");
			} else {
				System.out.println(bookToFind + "Does not exist in bookSet");
			}
			bookToFind = new Book(629, 87.00, "The BigBang Theory", BookTypes.HARDBACK);
			if(bookSet.contains(bookToFind)== true) {
				System.out.println(bookToFind + "Exists in bookSet");
			} else {
				System.out.println(bookToFind + "Does not exist in bookSet");
			}
		} catch (BookException e) {
			System.err.println("Error" + bookToFind + e.getMessage());
		}
			
	}
}

