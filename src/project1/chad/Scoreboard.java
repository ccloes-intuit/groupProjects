package project1.chad;

public class Scoreboard {

	private static GameEntry[] games;
	private static int numberOfGames = 5;
	private static int totalGames = 0;

	public Scoreboard () {
		games = new GameEntry[numberOfGames];
	}
	
	public void initializeScoreboard (int newNumberOfGames) {
		games = new GameEntry[newNumberOfGames];
		numberOfGames = newNumberOfGames;
		totalGames = 0;
	}
	
	public int getNumberOfGames() {
		return numberOfGames;
	}

	public GameEntry getGame(int i) {
		return games[i];
	}

	public void addGame (GameEntry game) {
		games[totalGames] = game;
		totalGames++;
	}
	
	public int getNumberOfEntries() {
		return totalGames;
	}
	
	public GameEntry[] getGames() {
		return games;
	}
	
	public void setGames(GameEntry[] sortedGames) {
		games = sortedGames;
	}
	
	public void printScoreboard(SinglyLinkedList<GameEntry> current) {
		int iterator = current.size();
		SinglyLinkedList<GameEntry> temp = null;
		try {
			temp = current.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (iterator != 0) {
			System.out.println("SCORE = " + temp.first().getName() + " " + temp.first().getScore());
			temp.removeFirst();
			iterator--;
		}
	}
}
