package array;

public class Datastorage {
	private int lengthOfTheArray;
	private int unsortedArray[],arraySortedInAscendingOrder[],arraySortedInDescendingOrder[];
	
	public int getLengthOfTheArray() {
		return lengthOfTheArray;
	}
	public void setLengthOfTheArray(int lengthOfTheArray) {
		this.lengthOfTheArray = lengthOfTheArray;
	}
	public int[] getUnsortedArray() {
		return unsortedArray;
	}
	public void setUnsortedArray(int[] unsortedArray) {
		this.unsortedArray = unsortedArray;
	}
	public int[] getArraySortedInAscendingOrder() {
		return arraySortedInAscendingOrder;
	}
	public void setArraySortedInAscendingOrder(int[] arraySortedInAscendingOrder) {
		this.arraySortedInAscendingOrder = arraySortedInAscendingOrder;
	}
	public int[] getArraySortedInDescendingOrder() {
		return arraySortedInDescendingOrder;
	}
	public void setArraySortedInDescendingOrder(int[] arraySortedInDescendingOrder) {
		this.arraySortedInDescendingOrder = arraySortedInDescendingOrder;
	}
	
}
