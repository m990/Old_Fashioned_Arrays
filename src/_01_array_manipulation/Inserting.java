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
	public static String[] insertAlphabetically(String[] wordList, String word) {
		
		String[] newArr = new String[wordList.length + 1];
		boolean found = false;
		for (int i = 0; i < wordList.length; i++) {
			if ((wordList[i].compareTo(word) >= 0) && (!found)) {
				newArr[i] = word;
				newArr[i+1] = wordList[i];
				found = true;
			}
			else if (found) {
				newArr[i+1] = wordList[i];
			}
			else {
				newArr[i] = wordList[i];
			}
		}
		if (!found) {
			newArr[newArr.length-1] = word;
		}
		for (String s: newArr) {
			System.out.println(s);
		}
		return newArr;
	}
}
