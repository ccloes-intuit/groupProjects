package project1;

public class Scoreboard {
	
	public static void main(String[] args) {
		SinglyLinkedList<GameEntry> scoreboard = new SinglyLinkedList<GameEntry>();
		
		GameEntry game1 = new GameEntry("Chad", 999999999);
		GameEntry game2 = new GameEntry("Frank", 100000);
		GameEntry game3 = new GameEntry("Alice", 1000);
		GameEntry game4 = new GameEntry("Zelda", 100);
		
//		ArrayList<GameEntry> = game1, game2, game3, game4;
		
		scoreboard.addFirst(new GameEntry("Should B First", 10000));
		scoreboard.addLast(new GameEntry("Should B Last", 100));
			
		printScoreboard(scoreboard);

	}

	private static void printScoreboard(SinglyLinkedList<GameEntry> current) {
		while (current.isEmpty() == false) {
			System.out.println("SCORE = " + current.first().getName() + " " + current.first().getScore());
			current.removeFirst();
		}
	}
}
