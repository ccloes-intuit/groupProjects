package project1;

public class Scoreboard {
	
	public static void main(String[] args) {
		SinglyLinkedList<GameEntry> scoreboard = new SinglyLinkedList<GameEntry>();
		
		scoreboard.addFirst(new GameEntry("Chad", 1000));
		scoreboard.addFirst(new GameEntry("Should B First", 10000));
		scoreboard.addLast(new GameEntry("Should B Last", 100));
			
		printScoreboard(scoreboard);

	}

	private static void printScoreboard(SinglyLinkedList<GameEntry> current) {
		SinglyLinkedList<GameEntry> localScore = current;
		while (localScore.isEmpty() == false) {
			if (localScore.isEmpty() == false) {
				System.out.println("SCORE = " + localScore.first().getName() + " " + localScore.first().getScore());
				localScore.removeFirst();
			}
			else {
				System.out.println("Uhh... done?");
			}
		}
	}
}
