package codewrought.challenge;

import java.util.ArrayList;
import java.util.List;

import codewrought.twod.Circle;
import codewrought.twod.Shape;
import codewrought.twod.Square;

import codewrought.structure.*;

/**
 * This is the main driver of the challenges. Run codewrought.Curiosity class in the 
 * command-line or in your IDE and see the console output. If you passed the
 * challenge, it'll will display a congratulations. 
 * 
 * To run in the command-line, open a shell/terminal, then cd to the root 
 * directory where the .class files are compiled. 
 * E.g. "cd /Users/[your-user-name]/[your-workspace]/Challenge/bin"
 * Then run it using "java".
 * E.g. "java -classpath . codewrought.challenge.Curiosity"
 * 
 * @author syong
 *
 */
public class Curiosity {

	public static int[] RANDOM_INTEGERS = {5, 36, 12, 18, 9, 7, -3, -5, -38, 1};

	private static void challenge01() {
		System.out.println("Challenge #1");		
		
		int total = DataManipulator.sum(RANDOM_INTEGERS);
		
		
		if (total != 42) {
			System.out.println("Expecting total of 42, but got " +
					total + " instead.");
		} else {
			System.out.println("Congrats! You passed challenge #1.");
		}
	}
	
	
	private static void challenge02() {
		System.out.println("Challenge #2");
		
		SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
		
		// Create 10 (from 0 to 9) Integer objects and stuff it into the ArrayList
		for (int i = 0; i < 10; i++) {
			list.addTail(Integer.valueOf(i));
		}
		
		DataManipulator.reverse(list);
		
		boolean hasErrors = false;
		
		Object[] items = list.walkList();
		
		// Now check the list to make sure that it's reversed
		for (int i = 0; i < items.length; i++) {
			Integer data = (Integer)items[i];
			int reversedCount = 9 - i;
			if (data == null) {
				System.out.println("Oops! Null object returned");
				hasErrors = true;
			} else if (data.intValue() != reversedCount) {
				System.out.println("Expecting " + reversedCount + 
						", but got " + data.intValue() + " instead!");
				hasErrors = true;
			} 
		}
		if (!hasErrors) {
			System.out.println("Congrats! You passed challenge #2.");
		}
		
	}
	
	private static void challenge03() {
		System.out.println("Challenge #3");
		
		List<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Circle(4.0f));
		shapes.add(new Square(3.0f));
		float summedArea = DataManipulator.sumAreas(shapes);
		
		float expectedArea = Shape.PI * 4.0f * 4.0f + 3.0f * 3.0f;		
		
		if (summedArea != expectedArea)  {
			System.out.println("Expecting area of " + expectedArea + 
					", but got " + summedArea + " instead!");
		} else {
			System.out.println("Congrats! You passed challenge #3.");
		}
		
	}

	
	private static void challenge04() {
		System.out.println("Challenge #4");
		
		int[] sorted = DataManipulator.sortAscending(RANDOM_INTEGERS);
		
		boolean isSorted = true;
		if (sorted != null && sorted.length > 1) {
			// Start from second item (index = 1) and compare with previous number
			for (int i = 1, prev = sorted[0]; i < sorted.length; i++) {
				int curr = sorted[i];
				
				if (prev >= curr) {
					isSorted = false;
					break;
				}
				
				prev = curr;
			}
		} else {
			isSorted = false;
			System.out.println("No list of sorted numbers given");
		}
		
		if (!isSorted) {
			System.out.println("Congrats! You passed challenge #4.");
		} else {
			System.out.println("List of numbers is not sorted ascending!");
		}
	}
	

	
	
	/**
	 * This is the main driving program that you can run to test and verify 
	 * the code that you have written for the challenges.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Challenger!");
		
		challenge01();
		
		challenge02();
		
		challenge03();
		
		challenge04();		
	}

}
