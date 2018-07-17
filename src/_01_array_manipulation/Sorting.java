package _01_array_manipulation;

public class Sorting {
	public static String[] sort(String[] wordList) {
		String tempStr;
		for (int i = 0; i < wordList.length-1; i++) {
			for (int j = 0; j < wordList.length-1; j++) {
				if (wordList[j].compareTo(wordList[j+1]) > 0) {
					tempStr = wordList[j];
					wordList[j] = wordList[j+1];
					wordList[j+1] = tempStr;
				}
			}
		}
		return wordList;
	}
}
