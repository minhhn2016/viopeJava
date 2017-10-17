package viopeJava_chapter9_OOP_cont;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean stopEntering = false;
		boolean stopChecking = false;
		String englishWord = "";
		String finnishWord = "";
		String orignalWord = "";
		String translatedWord = "";
		ArrayList<WordPair> wordsList = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		while (!stopEntering) {
			System.out.println("Enter an English word: ");
			englishWord = input.nextLine();

			if (!englishWord.toLowerCase().equals("ok")) {
				System.out.println("Enter a Finnish word: ");
				finnishWord = input.nextLine();
				wordsList.add(new WordPair(englishWord, finnishWord));
			} else {
				stopEntering = true;
			}
		}

		System.out.println("=== English-Finnish translation service (quit ends) ===");
		while (!stopChecking) {
			System.out.println("Enter an English word: ");
			englishWord = input.nextLine();

			if (!englishWord.toLowerCase().equals("quit")) {
				for (WordPair wordPair : wordsList) {
					orignalWord = wordPair.getEnglishWord();
					if (orignalWord.toLowerCase().equals(englishWord)) {
						translatedWord = wordPair.getFinnishWord();
						break;
					} else {
						translatedWord = "Unknown word";
					}
				}
				System.out.println(translatedWord);
			} else {
				stopChecking = true;
				System.out.println("Bye!");
			}

		}
	}

}
