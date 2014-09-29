package project1.chad;

public class Scoreboard {

	private static SinglyLinkedList<GameEntry> games;
	private static int totalGames = 0;
	private static GameEntry highScore = null;
	private static GameEntry lowScore = null;

	public GameEntry getHighScore()
	{
		return highScore;
	}

	public GameEntry getLowScore()
	{
		return lowScore;
	}

	public Scoreboard () {
		games = new SinglyLinkedList<GameEntry>();
		highScore = new GameEntry();
		lowScore = new GameEntry();
	}
	
	public int getTotalGames() {
		return totalGames;
	}

	public void addGame (GameEntry game) {
		if ( game.getScore() > highScore.getScore() )
		{
			games.addFirst(game);
			highScore = game;
		}
		else if ( game.getScore() < lowScore.getScore() )
		{
			games.addLast(game);
			lowScore = game;
		}
		else 
		{
			games = games.addBetween(game);
		}
		totalGames++;
	}
	
	public void removeLast()
	{
		games = games.removeLast();
	}
	
	public void printScoreboard() {
		int iterator = games.size();
		SinglyLinkedList<GameEntry> temp = null;
		try {
			temp = games.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		while (iterator != 0) {
			System.out.print(temp.first().toString());
			temp.removeFirst();
			iterator--;
		}
	}
}
