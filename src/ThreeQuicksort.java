/* Daniel Eggers
 * CMPSCI-3130-001-FA2020
 * Project 2 - Three Versions of Quicksort
 * 5/17/2020 
 */

import java.util.Scanner;

public class ThreeQuicksort {

	public static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		printHeader();
		
		/* First Array (Random Data) */
		System.out.print("Generating Array1 with random data... ");
		int[] arrayRan = new int[Global.SIZE];
		for(int i = 0; i < Global.SIZE; i++) {
			arrayRan[i] = RNG.getRandomNumberInRange(0, 999);
		}
		System.out.println("Done.");
		
		/* Second Array (Ascending Order 1-1000) */
		System.out.print("Generating Array2 with ascending data... ");
		int[] arrayAsc = new int[Global.SIZE];
		for(int i = 1; i < Global.SIZE; i++) {
			arrayAsc[i] = i;
		}
		System.out.println("Done.");
		
		/* Third Array (Descending Order 1-1000) */
		System.out.print("Generating Array3 with descending data... ");
		int[] arrayDes = new int[Global.SIZE];
		for(int i = 1; i < Global.SIZE; i++) {
			arrayDes[i] = i;
		}
		System.out.println("Done.");
		
		long startTime; // use to record execution time
		long elapsedTimeNS;
		long elapsedTimeMS;
						
		// print first array (random data)
		System.out.println("\n\n[ Array1 Unsorted ]");
		printArray(arrayRan);
		
		Global.countswaps = 0;
		Global.countcomps = 0;
		System.out.println("\n[ Array1 QuickSort (Normal Pivot) ]");
		startTime = System.nanoTime();
		printArray(quicksortOriginal(arrayRan, 0, Global.SIZE - 1));
		elapsedTimeNS = (System.nanoTime() - startTime);
		elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.println("The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("Number of comparisons: " + Global.countcomps);
		System.out.println("Number of swaps: " + Global.countswaps);
		
		Global.countswaps = 0;
		Global.countcomps = 0;
		System.out.println("\n\n[ Array1 QuickSorted (Random Pivot) ]");
		startTime = System.nanoTime();
		printArray(quicksortRandom(arrayRan, 0, Global.SIZE - 1));
		elapsedTimeNS = (System.nanoTime() - startTime);
		elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.println("The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("Number of comparisons: " + Global.countcomps);
		System.out.println("Number of swaps: " + Global.countswaps);
		
		Global.countswaps = 0;
		Global.countcomps = 0;
		System.out.println("\n\n[ Array1 QuickSorted (Median Pivot) ]");
		startTime = System.nanoTime();
		printArray(quicksortMedian(arrayRan, 0, Global.SIZE - 1));
		elapsedTimeNS = (System.nanoTime() - startTime);
		elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.println("The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("Number of comparisons: " + Global.countcomps);
		System.out.println("Number of swaps: " + Global.countswaps);
		
		// print second array (ascending data)
		Global.countswaps = 0;
		Global.countcomps = 0;
		System.out.println("\n[ Array2 QuickSort (Normal Pivot) ]");
		startTime = System.nanoTime();
		printArray(quicksortOriginal(arrayAsc, 0, Global.SIZE - 1));
		elapsedTimeNS = (System.nanoTime() - startTime);
		elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.println("The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("Number of comparisons: " + Global.countcomps);
		System.out.println("Number of swaps: " + Global.countswaps);
		
		Global.countswaps = 0;
		Global.countcomps = 0;
		System.out.println("\n\n[ Array2 QuickSorted (Random Pivot) ]");
		startTime = System.nanoTime();
		printArray(quicksortRandom(arrayAsc, 0, Global.SIZE - 1));
		elapsedTimeNS = (System.nanoTime() - startTime);
		elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.println("The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("Number of comparisons: " + Global.countcomps);
		System.out.println("Number of swaps: " + Global.countswaps);
		
		Global.countswaps = 0;
		Global.countcomps = 0;
		System.out.println("\n\n[ Array2 QuickSorted (Median Pivot) ]");
		startTime = System.nanoTime();
		printArray(quicksortMedian(arrayAsc, 0, Global.SIZE - 1));
		elapsedTimeNS = (System.nanoTime() - startTime);
		elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.println("The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("Number of comparisons: " + Global.countcomps);
		System.out.println("Number of swaps: " + Global.countswaps);
		
		// print third array (descending data)
		Global.countswaps = 0;
		Global.countcomps = 0;
		System.out.println("\n[ Array3 QuickSort (Normal Pivot) ]");
		startTime = System.nanoTime();
		printArray(quicksortOriginal(arrayDes, 0, Global.SIZE - 1));
		elapsedTimeNS = (System.nanoTime() - startTime);
		elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.println("The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("Number of comparisons: " + Global.countcomps);
		System.out.println("Number of swaps: " + Global.countswaps);
		
		Global.countswaps = 0;
		Global.countcomps = 0;
		System.out.println("\n\n[ Array3 QuickSorted (Random Pivot) ]");
		startTime = System.nanoTime();
		printArray(quicksortRandom(arrayDes, 0, Global.SIZE - 1));
		elapsedTimeNS = (System.nanoTime() - startTime);
		elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.println("The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("Number of comparisons: " + Global.countcomps);
		System.out.println("Number of swaps: " + Global.countswaps);
		
		Global.countswaps = 0;
		Global.countcomps = 0;
		System.out.println("\n\n[ Array3 QuickSorted (Median Pivot) ]");
		startTime = System.nanoTime();
		printArray(quicksortMedian(arrayDes, 0, Global.SIZE - 1));
		elapsedTimeNS = (System.nanoTime() - startTime);
		elapsedTimeMS = (elapsedTimeNS / 1000000);  // convert nsec to ms
		System.out.println("The execution time was " + elapsedTimeMS + " ms (" + elapsedTimeNS + " nsec).");
		System.out.println("Number of comparisons: " + Global.countcomps);
		System.out.println("Number of swaps: " + Global.countswaps);
		
	} 
	
	
	/*************************************************************************/
	
	/* Quicksort Methods */
	static int[] quicksortOriginal(int[] arr, int indexStart, int indexEnd) {
		Global.countcomps++;
		if (indexStart < indexEnd) {	
			int pivot = arr[indexEnd];  // select last element as the pivot
			int indexPartition = partitionStep(arr, indexStart, indexEnd, pivot);
			quicksortOriginal(arr, indexStart, indexPartition - 1); // left-side of partition
			quicksortOriginal(arr, indexPartition + 1, indexEnd); // right-side of partition
		}
		
		return arr;
	} 
	
	static int[] quicksortRandom(int[] arr, int indexStart, int indexEnd) {
		Global.countcomps++;
		if (indexStart < indexEnd) {
			int indexPivot = RNG.getRandomNumberInRange(indexStart, indexEnd);  // select random element as the pivot
		
			// swap pivot index with end index
			Global.countswaps++;
			int temp = arr[indexEnd];
			arr[indexEnd] = arr[indexPivot];
			arr[indexPivot] = temp;
		
			int pivot = arr[indexEnd];
		
			int indexPartition = partitionStep(arr, indexStart, indexEnd, pivot);
			quicksortRandom(arr, indexStart, indexPartition - 1); // left-side of partition
			quicksortRandom(arr, indexPartition + 1, indexEnd); // right-side of partition
		}
				
		return arr;
	} 
	
	static int[] quicksortMedian(int[] arr, int indexStart, int indexEnd) {
		Global.countcomps++;
		if (indexStart < indexEnd) {
			int indexPivot = getMedianOfThree(arr, indexStart, indexEnd);  // select random element as the pivot
		
			// swap pivot index with end index
			Global.countswaps++;
			int temp = arr[indexEnd];
			arr[indexEnd] = arr[indexPivot];
			arr[indexPivot] = temp;
		
			int pivot = arr[indexEnd];
		
			int indexPartition = partitionStep(arr, indexStart, indexEnd, pivot);
			quicksortMedian(arr, indexStart, indexPartition - 1); // left-side of partition
			quicksortMedian(arr, indexPartition + 1, indexEnd); // right-side of partition
		}
				
		return arr;
	} 
	
	static int getMedianOfThree(int arr[], int indexStart, int indexEnd) {
		int a = arr[indexStart]; // first element
		int b = (indexEnd / 2);  // middle element
		int c = arr[indexEnd];   // last element
		
		// find the median of three and return it
		if (a < b)
			if (a > c) 
				return indexStart;
			else 
				return indexEnd;
		else if (b > c) 
			return (indexEnd / 2);
		else 
			return indexEnd;		
	}
	
	
	static int partitionStep(int[] arr, int indexStart, int indexEnd, int pivot) {
		int indexPartition = indexStart;  // partition index begins at arr[0]
		int temp;
		
		for(int i = indexStart; i < indexEnd; i++) {
			Global.countcomps++;
			if (arr[i] <= pivot) {
				
				// swap elements as we move the partition index through array
				Global.countswaps++;
				temp = arr[i];
				arr[i] = arr[indexPartition];
				arr[indexPartition] = temp;
				
				indexPartition += 1;
			}
		}
				
		// swap elements the chosen pivot with concluded partition index
		Global.countswaps++;
		temp = arr[indexPartition];
		arr[indexPartition] = arr[indexEnd];
		arr[indexEnd] = temp;
		
		return indexPartition;
	}	

	
	
	/* Print Methods */
	static void printArray(int[] arr) {
		// print array formatted 20 numbers per line
		for(int i = 0; i < Global.SIZE; i++) {
			if(i % 20 == 0){System.out.print("\n");}
			System.out.print(String.format("%03d", arr[i]) + ", ");
		}
		System.out.println();
	}
	
	static void printHeader() {
		System.out.println("THREE VERSIONS OF QUICKSORT.");
		System.out.println("Author: Daniel Eggers");
		System.out.println("Class: CMPSCI-3130-001-FA2020");
		System.out.println("Instructor: Wenjie He");
		System.out.println();
	}

}
