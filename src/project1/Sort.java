package project1;

public class Sort {
	
	public static GameEntry[] insertionSort (GameEntry[] localList, int numberOfEntries) {
		for (int counter = 1; counter < numberOfEntries; counter++) {
			GameEntry currentGame = localList[counter];
			int currentArrayLocation = counter;
			while (currentArrayLocation > 0 && localList[currentArrayLocation-1].getScore() > currentGame.getScore()) {
				localList[currentArrayLocation] = localList[currentArrayLocation-1];
				currentArrayLocation--;
			}
			localList[currentArrayLocation] = currentGame;
		}
		return localList;
	}
}
