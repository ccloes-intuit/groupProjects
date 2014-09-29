package project1.chad;

public class ScoreboardTest {
	
	public static void main(String[] args) {
		Scoreboard scores = new Scoreboard();
		
		System.out.println("Number of Games: " + scores.getTotalGames());
		System.out.println("Adding some games...");
		scores.addGame(new GameEntry("Chad", 999999999));
		scores.addGame(new GameEntry("Frank", 100000));
		scores.addGame(new GameEntry());
		scores.addGame(new GameEntry("Alice", 1000));
		scores.addGame(new GameEntry("Zelda", 900000));
		scores.addGame(new GameEntry());

		System.out.println("Number of Games: " + scores.getTotalGames());
		System.out.println("Showing the scoreboard:");
		scores.printScoreboard();
		System.out.println("\n");

		System.out.println("Removing the last game entry:");
		scores.removeLast();
		System.out.println("Number of Games: " + scores.getTotalGames());
		System.out.println("Showing the scoreboard:");
		scores.printScoreboard();
		System.out.println("\n");
		
		System.out.println("Adding two additional scores in between: ");
		scores.addGame(new GameEntry("MiddleMax", 800000));
		scores.addGame(new GameEntry("MiddleAlice", 3000));
		System.out.println("Number of Games: " + scores.getTotalGames());
		System.out.println("Showing the scoreboard:");
		scores.printScoreboard();
		System.out.println("\n");
		
		System.out.println("HIGHSCORE = " + scores.getHighScore().getName() + " " + scores.getHighScore().getScore());
		System.out.println("LOWSCORE = " + scores.getLowScore().getName() + " " + scores.getLowScore().getScore());
		
	}
}
