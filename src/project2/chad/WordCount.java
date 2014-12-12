package project2.chad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

@SuppressWarnings("resource")
public static void main(String[ ] args) throws FileNotFoundException { 
	Map<String,Integer> freq = new ChainHashMap<String, Integer>();  
	Scanner doc = new Scanner(new File("system.txt")).useDelimiter("[^a-zA-Z]+"); 
	while (doc.hasNext()) {

		String word = doc.next().toLowerCase();	// convert next word to lowercase
		Integer count = (Integer) freq.get(word); 
		if (count == null)
			count = 0; 
			freq.put(word, 1 + count);
			// get the previous count for this word
			// if not in map, previous count is zero // (re)assign new count for this word
		}
		int maxCount = 0; String maxWord = "no word"; 
		for (Entry<String, Integer> ent : freq.entrySet()) {
			if (ent.getValue() > maxCount) { 
				maxWord = ent.getKey(); 
				maxCount = ent.getValue();
			}
		}
	// find max-count word
	System.out.print("The most frequent word is '" + maxWord); 
	System.out.println("' with " + maxCount + " occurrences.");

	}
}