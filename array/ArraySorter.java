package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySorter {

	int[] temp;
	Datastorage object = new Datastorage();
	Scanner scan = new Scanner(System.in);

	void getTheArrayElements() {

		System.out.println("Enter the length of the array");
		try {
			object.setLengthOfTheArray(scan.nextInt());

		} catch (InputMismatchException exception) {
			System.err.println("Enter the integer Input");
			System.exit(0);
		}

		System.out.println("Enter the elements of unsorted Array");

		int[] temp = new int[object.getLengthOfTheArray()];

		for (int charIndex = 0; charIndex < temp.length; charIndex++) {

			temp[charIndex] = scan.nextInt();

		}
		object.setUnsortedArray(temp);

	}
	

	void sortTheArrayInAscendingOrder() {

		temp = object.getUnsortedArray();
		for (int i = 0; i < temp.length; i++) {

			int tempStore;
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i] > temp[j]) {
					tempStore = temp[i];
					temp[i] = temp[j];
					temp[j] = tempStore;
				}

			}
		}
		object.setArraySortedInAscendingOrder(temp);
	}

	void displayTheArraySortedInAscendingOrder() {

		System.out.print("Sorted array AscendingOrder  : ");
		temp = object.getArraySortedInAscendingOrder();
		for (int index = 0; index < temp.length; index++) {

			System.out.print(temp[index] + " ");
		}

	}

	void sortTheArrayInDescendingOrder() {

		temp = object.getUnsortedArray();
		for (int i = 0; i < temp.length; i++) {

			int tempStore;
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i] < temp[j]) {
					tempStore = temp[i];
					temp[i] = temp[j];
					temp[j] = tempStore;
				}

			}
		}
		object.setArraySortedInDescendingOrder(temp);
	}

	void displayTheArraySortedInDescendingOrder() {
		System.out.println();
		System.out.print("Sorted array DescendingOrder  : ");
		temp = object.getArraySortedInDescendingOrder();
		for (int index = 0; index < temp.length; index++) {

			System.out.print(temp[index] + " ");
		}

	}
}