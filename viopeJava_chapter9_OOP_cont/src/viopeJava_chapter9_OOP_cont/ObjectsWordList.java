package viopeJava_chapter9_OOP_cont;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsWordList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		ArrayList<String> wordList = new ArrayList<String>();

		while (!quit) {
			System.out.println("Enter a word (quit ends):");
			String userEntered = input.nextLine();

			if (!userEntered.toLowerCase().equals("quit")) {
				wordList.add(userEntered);
			} else {
				quit = true;
			}
		}

		Collections.sort(wordList);

		for (String word : wordList) {
			System.out.println(word);
		}
	}
}
