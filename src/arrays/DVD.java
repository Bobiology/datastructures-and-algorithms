package arrays;

import java.util.Arrays;

public class DVD {
	public String title;
	public int releaseYear;
	public String director;
	
	//DVD constructor. Takes title, releaseYear and director as input
	public DVD(String title, int realeseYear, String director){
		this.title=title;
		this.releaseYear=realeseYear;
		this.director=director;
	}
	@Override
	public String toString() {
		//System.out.println(this.title + ", directed by " + this.director + ", released in " + this.releaseYear);
		return "dvd [title=" + title + ", releaseYear=" + releaseYear + ", director=" + director + "]";
	}
	
	public static void main(String[] args) {
		
		DVD[] dvdCollection = dvdInsert();
		
		System.out.println(Arrays.toString(dvdCollection));
		
		squareOfIndex();
	}
	private static int[] squareOfIndex() {
		int[] values = new int[10];
		for(int i=0;i<values.length;i++) {
			values[i]=(i+1)*(i+1);
		}
		System.out.println("Values: "+Arrays.toString(values));
		return values;
	}
	private static DVD[] dvdInsert() {
		DVD[] dvdCollection = new DVD[15];
		
		DVD dvdLegend = new DVD("Legend Of The Seeker", 2013, "Merlin");
		DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
		DVD dvdArrow = new DVD("The Arrow", 2015, "Oliver Queen");
		DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
		DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
		DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
		DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
		
		dvdCollection[3] = starWarsDVD;
		
		// Put "The Avengers" into the 8th place: index 3.
		dvdCollection[7]=avengersDVD;
		
		// Put "The Arrow" into the 1st place: index 3.
		dvdCollection[0]=dvdArrow;
		
		// Put "The Legend Of The Seeker" into the 15th place: index 3.
		dvdCollection[14]=dvdLegend;
		
		// Put "The Incredibles" into the 4th place: index 3.
		dvdCollection[3] = incrediblesDVD;

		// Put "Finding Dory" into the 10th place: index 9.
		dvdCollection[9] = findingDoryDVD;

		// Put "The Lion King" into the 3rd place: index 2.
		dvdCollection[2] = lionKingDVD;
		//System.out.println(Arrays.toString(dvdCollection));
		dvdCollection[3] = starWarsDVD;
		return dvdCollection;
	}
}
