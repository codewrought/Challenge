package codewrought.challenge;

import java.util.List;

import codewrought.twod.Shape;
import codewrought.structure.*;

/**
 * Manipulate data based on the rules provided
 * @author syong
 *
 */
public class DataManipulator {
	
	/**
	 * Given the SimpleList object, reverse its contents. For example, if it 
	 * contains the Integers 1, 2, 3, ... When this method is done, 
	 * the ArrayList should contain ..., 3, 2, 1
	 * @param list List of integers to be rearranged
	 */
	public static void reverse(SimpleLinkedList<Integer> list) {
		
		// TODO Implement me. Use recursion. You should NOT have to modify the
		// SimpleLinkedList or SimpleLinkItem class!
	}
	
	
	/**
	 * This will calculate the sum of the areas of the given list of Shapes. Go
	 * modify the Shapes classes to make this work.
	 * 
	 * @param shapes List of shape objects
	 * @return The total area
	 */
	public static float sumAreas(List<Shape> shapes) {
		float totalArea = 0.0f;
		
		for (Shape shape: shapes) {
			totalArea += shape.calculateArea();
		}
		
		return totalArea;
	}


	/**
	 * Sum all the numbers in the given array
	 * @param numbers Array of integers to be summed
	 * @return
	 */
	public static int sum(int[] numbers) {
		// TODO compute the sum of the numbers in the arrays
		return 0;
	}
	
	
	/**
	 * Sort the given set of numbers and put the sorted values in the return
	 * array of ints.
	 * @param numbers Input array of unsorted integers.
	 * @return Output array of sorted integers.
	 */
	public static int[] sortAscending(int[] numbers) {
		int[] sorted = new int[numbers.length];
		
		// TODO put the sorted numbers into the "sorted" array
		// Simplest is to do a bubble sort, but you can try 
		// different algorithms.
		
		return sorted;
	}

}
