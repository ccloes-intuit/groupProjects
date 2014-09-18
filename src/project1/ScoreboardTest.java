package project1;

public class ScoreboardTest {

	static int numberOfGames = 8;
	
	public static void main(String[] args) {
		SinglyLinkedList<GameEntry> myScoreboard = new SinglyLinkedList<GameEntry>();
		Scoreboard scores = new Scoreboard();
		
		scores.initializeScoreboard(numberOfGames);
		System.out.println("Number of Games: " + scores.getNumberOfGames());
		scores.addGame(new GameEntry("Chad", 999999999));
		scores.addGame(new GameEntry("Frank", 100000));
		scores.addGame(new GameEntry("Alice", 1000));
		scores.addGame(new GameEntry("Zelda", 900000));
		scores.addGame(new GameEntry());
		scores.addGame(new GameEntry());

		scores.setGames(Sort.insertionSort(scores.getGames(), scores.getNumberOfEntries()));
		
		for (int cnt = 0; cnt < scores.getNumberOfEntries(); cnt++) {
			myScoreboard.addFirst(scores.getGame(cnt));
		}
			
		scores.printScoreboard(myScoreboard);

	}

}
