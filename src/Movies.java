import java.util.Arrays;
import java.util.Scanner;

public class Movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] movieNo = { 1, 2, 3, 4, 5, 6, 7, 8 };
		String[] movieName = { "Harry Potter and the Philosopher's Stone ", "Harry Potter and the Chamber of Secrets",
				"Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire",
				"Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince",
				"Harry Potter and the Deathly Hallows – Part 1", "Harry Potter and the Deathly Hallows – Part 2" };
		int[] releaseYear = { 2001, 2002, 2004, 2005, 2007, 2009, 2010, 2011 };
		Scanner input = new Scanner(System.in);

		int releaseYearLength = releaseYear.length;
		int i;
		

		System.out.println("Menu\n"
				+ "1. Find Elapsed Years\n"
				+ "2.Approx years for Movie release\n"
				+ "3.Enter Movie No to find movie name\n"
				+ "4.Find 1st or last movie\n"
				+ "5.Find movie by number\n"
				+ "6.Print all movies\n"
				+ "7.Create your movie Database\n"
				+ "Enter the option\n");
		int option = input.nextInt();
		int elapsedTime = releaseYear[releaseYearLength - 1] - releaseYear[0];
		
		switch (option) {

		case 1:
			
			System.out.println("Elapsed Years between 1st and last movie: " + elapsedTime);
			break;

		case 2:

			int movieLength = movieName.length;
	      
	        double apporoxyears = (double)elapsedTime / (double)movieLength;
	        int noOfYears = (int) Math.floor(apporoxyears);
	        int month = (int)((apporoxyears-noOfYears)*12);	
	        System.out.println("Approximate Years for a Movie Release :"+ noOfYears + " year(s) and " + month +" months");
			break;

		case 3:
			System.out.println("Enter the movie no. from 1 to 8 to find its name:");
			int arrayIndex = input.nextInt();
			
			if ((arrayIndex <= 8) && (arrayIndex > 0)) {
				System.out.println("The movie name is:" + movieName[arrayIndex - 1]);
			} 
			else
				System.out.println("inpt is InValid number ");
			break;
			
		case 4:
			System.out.println("Enter the no. to find the first or last movie:");
			arrayIndex = input.nextInt();
			System.out.println("The movie name is :" +movieName[arrayIndex-1]);
			
			if (arrayIndex == 1) {
				System.out.println("First Movie:" + movieName[arrayIndex - 1]);
			} 
			
			else if (arrayIndex == 8) {
				System.out.println("Last Movie:" + movieName[arrayIndex - 1]);
			} 
			
			else {
				System.out.println("Not first or last movie");
			}
			break;

		case 5:
		
			while (true) {

				System.out.println("Please enter a number to find the movie:");
				arrayIndex = input.nextInt();

				if ((arrayIndex <= releaseYearLength) && (arrayIndex > 0))
					System.out.println("The corresponding Movie is : " + movieName[arrayIndex - 1]);
				else
					break;
			} // while

			System.out.println("Sorry ! Invalid Input. Pls enter between 1 to 8");
			break;

		case 6:
			System.out.println("          \n                   MOVIE DATABASE\n");
			System.out.println("\nMovie No           Movie Name                      Release Year\n");
			for (i = 0; i < releaseYearLength; i++) {
				System.out.println(movieNo[i] + "        " + movieName[i] + "          " + releaseYear[i] + "\n");

			} // for
			break;

		case 7:
			String[] userMovieName = new String[5];
			int[] userMovieRealeasedYear = new int[5];
			int[] userMovieNo = new int[5];

			System.out.println("Create your own database\n Please enter the movie name and the Year released\n");

			for (i = 0; i < 5; i++) {
			
				userMovieNo[i] = i + 1;
				
				System.out.println("Enter Movie Name : ");
				userMovieName[i] = input.next();

				System.out.println("Enter Movie released year : ");
				userMovieRealeasedYear[i] = input.nextInt();

			}

			System.out.println("\nYOUR MOVIE DATABASE\n");
		
		
			for (String a : userMovieName) {
		
				System.out.println(a);
			}
			
		  
			input.close();
			break;
		}

	}// main
}// end
