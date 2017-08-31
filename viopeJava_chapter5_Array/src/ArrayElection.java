/**
 * Created by Minh Hoang on 12/07/2017.
 */

import java.util.Scanner;

public class ArrayElection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int topVote = 0;
        String winner = "";
        boolean duplicate = false;

        System.out.println("Enter the number of candidates: ");
        int numberOfCandidates = Integer.parseInt(input.nextLine());

        // Arrays to hold initial user inputs
        String[] candidatesNameArr = new String[numberOfCandidates];
        int[] candidatesVoteArr = new int[numberOfCandidates];

        // Arrays to hold results
        String[] winnersNameArr = new String[numberOfCandidates];
        int[] winnersVoteArr = new int[numberOfCandidates];

        // Loop to fill up initial array of inputs
        for (int i = 0; i < numberOfCandidates; i++) {
            System.out.println("Enter " + (i + 1) + ". name: ");
            candidatesNameArr[i] = input.nextLine();
            System.out.println("Enter votes: ");
            candidatesVoteArr[i] = Integer.parseInt(input.nextLine());
        }

        // Loop to sort filled arrays based on votes
        for (int i = 0; i < candidatesVoteArr.length; i++) {
            for (int j = i + 1; j < candidatesVoteArr.length; j++) {
                if (candidatesVoteArr[j] > candidatesVoteArr[i]) {
                    topVote = candidatesVoteArr[j];
                    winner = candidatesNameArr[j];
                    candidatesVoteArr[j] = candidatesVoteArr[i];
                    candidatesNameArr[j] = candidatesNameArr[i];
                    candidatesVoteArr[i] = topVote;
                    candidatesNameArr[i] = winner;
                }
            }
        }

        // Assign winner and coresponding vote to the winner array
        //winnersVoteArr[0] = candidatesVoteArr[0];
        //winnersNameArr[0] = candidatesNameArr[0];

        // Check for duplicate winners
        for (int i = 1; i < candidatesVoteArr.length; i++) {
            if (candidatesVoteArr[i] == candidatesVoteArr[0]) {
                //winnersVoteArr[i] = candidatesVoteArr[i];
                //winnersNameArr[i] = candidatesNameArr[i];
                duplicate = true;
            }
        }

        // Display results
        if (!duplicate) {
            System.out.println("The winner is " + candidatesNameArr[0] + " with " + candidatesVoteArr[0] + " votes!");
        } else {
            System.out.println("The election is a tie between the following candidates: ");
            for (int i = 0; i < winnersVoteArr.length; i++) {
                if (candidatesVoteArr[i] == candidatesVoteArr[0]) {
                    System.out.println(candidatesVoteArr[i] + " (" + candidatesVoteArr[i] + " votes)");
                }
            }
        }


    }
}

