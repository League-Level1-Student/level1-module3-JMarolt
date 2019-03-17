

public class Netflix {

	public static void main(String[] args) {
	Movie one = new Movie("High School", 4);
	Movie two = new Movie("Why Do People Still Play Fortnite(It's Awful)", 2);
	Movie three = new Movie("It Strikes Again(*Bites off Another Arm*)", 1);
	Movie four = new Movie("Minecraft Movie Mode", 3);
	Movie five = new Movie("Dora Vs. Thor", 5);

	NetflixQueue q = new NetflixQueue();
	q.addMovie(one);
	q.addMovie(two);
	q.addMovie(three);
	q.addMovie(four);
	q.addMovie(five);
	
	q.printMovies();
	
	System.out.println("The best movie is: " + q.getBestMovie());
	System.out.println("The second best movie is: " + q.getMovie(1));
	
	}
}
