/**
 * Created by Minh Hoang on 11/07/2017.
 */

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayLanguageTranslation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String englishWords[] = {"bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher"};
        String finnishWords[] = {"lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja"};
        int counter = 0;
        boolean valid = false;
        String result = "";

        System.out.println("Enter an English word: ");
        String userEntered = input.nextLine();


        for (int i = 0; i < englishWords.length; i++) {
            if (userEntered.equals(englishWords[i])) {
                valid = true;
                result = finnishWords[i];
            }
        }
        if (valid) {
            System.out.print(result);
        } else {
            System.out.print("Unknown word");
        }
    }

}

