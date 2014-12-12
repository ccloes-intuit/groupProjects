package extracredit.chad;
import net.datastructures.*;
import java.util.Comparator;

public class SortedListPriorityQueueTest {
	
	// here is the Comparator class for Autos
	private static class AutoComparator<T> implements Comparator<T> {
		
		// the overidden method to do the comparison between two
		// Autos
		public int compare (T left, T right) {
			Auto auto1 = (Auto)left;
			Auto auto2 = (Auto)right;
			int status = 0;
			
			// calculate the $ cost per horse of horsePower
			double ratioAuto1 = auto1.getCost () / auto1.getHorsePower ();
			double ratioAuto2 = auto2.getCost () / auto2.getHorsePower ();
			
			// now, do the comparison setting the value status
			if (ratioAuto1 > ratioAuto2) status = 1;
			if (ratioAuto1 == ratioAuto2) status = 0;
			if (ratioAuto1 < ratioAuto2) status = -1;
			
			return status;

		}  // end method compare
	}  // end inner class AutoComparator<T>

	// here's the main method of the SortedListPriorityQueueTest.java class
	public static void main(String[] args) {
		// declare local variables/references
		SortedPriorityQueue <Integer, String> queue1 =
								new SortedPriorityQueue <Integer, String> ();
		
		// create an object
		queue1.insert (5, "A");
		queue1.insert (9, "C");
		queue1.insert (3, "B");
		queue1.insert (7, "D");
		
		// print the queue info
		System.out.printf ("The queue is: %s\n", "queue1");
		
		// remove and print some minimum entries
		Entry<Integer, String>min1 = queue1.removeMin ();
		System.out.printf ("The first minimum key removed was: %d\n", min1.getKey ());
		
		queue1.removeMin ();
		min1 = queue1.removeMin ();
		System.out.printf ("The second minimum key removed was: %d\n", min1.getKey ());
		
		// add another
		queue1.insert (8, "F");
		
		// Now, do the queue of Autos, defining the comparator object first
		// Then, create a queue with that comparator
		AutoComparator<Auto>comp = new AutoComparator<Auto> ();
		SortedPriorityQueue <Auto, String> queue2 = 
				new SortedPriorityQueue <Auto, String> (comp);
		
		// place Autos on the queue
		queue2.insert (new Auto ("Chevy", "Camaro", 2500.0, 340), "Chevy");
		queue2.insert (new Auto ("Pontiac", "Firebird",50000.0, 500), "Pontiac");
		queue2.insert (new Auto ("Cadillac", "DeVille", 30000.0, 165), "Cadillac");
		queue2.insert (new Auto ("Volvo", "S-241", 25000.0, 340), "Volvo");
		queue2.insert (new Auto ("Dodge", "Viper", 20000.0, 500), "Dodge");
		queue2.insert (new Auto ("Chrysler", "Woody", 12000.0, 80), "Chrysler");
		queue2.insert (new Auto ("Honda", "Wagon", 7500.0, 87), "Honda");
		queue2.insert (new Auto ("Yamaha", "Bendo", 22500.0, 125), "Yamaha");
		queue2.insert (new Auto ("Toyota", "Prius", 33000.0, 60), "Toyota");
		queue2.insert (new Auto ("Isuzu", "Sneeze", 11000.0, 120), "Isuzu");
		
		// print queue info
		System.out.printf ("\n\nThe queue is queue2:\n");
		Entry <Auto, String>min2 = queue2.removeMin ();
		System.out.printf ("The first minimum auto removed was a: %s\n", min2.getValue ());
		
		queue1.removeMin ();
		min2 = queue2.removeMin ();
		System.out.printf ("The second minimum auto removed was a: %s\n", min2.getValue ());
		
	}  // end method main

}  // end class SortedListPriorityQueueTest
