package _01_array_manipulation;

public class Sorting {
	/*public static String[] sort(String[] words) {
		int currentSize = words.length;
		String[] sortedList = new String[currentSize];
		sortedList[0] = words[0];
		for (int i = 0; i < currentSize; i++) {
			boolean foundSpot = false;
			for (int j = 0; i < currentSize; i++) {
				String word = words[i];
				if (word.compareTo(sortedList[j]) < 0) {
					sortedList[i] = word;
					foundSpot = true;
					break;
				}
			}
			if (!foundSpot) {
				sortedList[i+1] = words[i];
			}
		}
		return sortedList;
	}*/
	public static String[] sort(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (words[i].compareTo(words[i+1]) < 0) {
				
			}
		}
	}
}
