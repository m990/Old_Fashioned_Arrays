package _01_array_manipulation;

public class Inserting {
	public static int[] insertAt(int[] numList, int location, int numToAdd) {
		int[] newArr = new int[numList.length + 1];
		boolean found = false;
		for (int i = 0; i < numList.length; i++) {
			if (i == location) {
				newArr[location] = numToAdd;
				newArr[location + 1] = numList[location];
				found = true;
			}
			else if (found) {
				newArr[i+1] = numList[i];
			}
			else {
				newArr[i] = numList[i];
			}
		}
		return newArr;
	}
}
