package Snake;
import java.util.*;

public class test {

	public static void main(String[] args) {
		
		String[] d = {"able", "ale", "apple", "bale", "kangaroo"};
		String s = "abppplee";
		
		System.out.println((int) 'A');
		
		//String result = longestWord(s, d);
	}
	
	public static String longestWord(String s, String[] d) {
		String result = "";
		if(d.length == 0) {
			return result;
		}
		
		Map<String, int[]> map = new HashMap<>();
		
		for(String word : d) {
			map.put(word, letterCountArray(word));
		}
		
		int[] sLetterCount = letterCountArray(s);
		
		for(String word : map.keySet()) {
			
		}
		
		return result;
	}
	
	public static int[] letterCountArray(String word) {
		word = word.toUpperCase();
		int[] letterCount = new int[26];
		for(int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			if(character >= 65 || character <= 65+26) {
				letterCount[character - 65]++;
			}
		}
		return letterCount;
	}

}
