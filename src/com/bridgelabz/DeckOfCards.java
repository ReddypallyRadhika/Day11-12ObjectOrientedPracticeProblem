/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author hp
 *
 */
public class DeckOfCards {

	/**
	 * @param args
	 */
	
	

		int noOfPlayers = 4;
		int noOfCardsToDistribute = 9;
		// Another method
		int maxNoOfCardsToBeDistrubuted = 9;

		// 2d Array for players
		String [][] players = new String [noOfPlayers][noOfCardsToDistribute];
		// 4 by 9 2d array
		// = = = = = = = = =
		// = = = = = = = = =
		// = = = = = = = = =
		// = = = = = = = = =
		// 2D array formula
		// data_type[][] array_name = {
		// {valueR1C1, valueR1C2, ....},
		// {valueR2C1, valueR2C2, ....}
		// };

		// Ranks and Suits
		String[] suitsArray = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranksArray = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		int[] deck = new int[52]; // suits * ranks = 52
		String[] deckOFCards = new String[52];

		// Constructor of class
		public DeckOfCards() 
		{
		
		for(int i=0;i<deck.length;i++) 
		{ // Confusing
		deck[i] = i; // 0 to 51
		}
		}

		// //=========== 2 random method to shuffle card============

		void shuffleCards() {
		for(int i=0;i<deck.length;i++) {
		/// 1 to 52
		int randomIndexValue = (int)(Math.random()*deck.length);
		// Type casting // 1 to 52

		// deck[0] = 0
		// deck[1] = 1
		int temp = deck[i];
		deck[i] = deck[randomIndexValue];
		deck[randomIndexValue]=temp;

		// Dimond, suits,etc
		// 2,3,4,5,6,7,8 etc

		String suit = suitsArray[deck[i]/13];
		// Random function from 1 to 4
		String rank = ranksArray[deck[i]%13];
		// Random function 1 to 13

		deckOFCards[i] = rank + "-" + suit;


		}
		}

		// =============// 3 assign the cards to player
		// Each player 9 Card

		//

		void normallyAssignCards() {

		// Array name is players // Loop will 4 * 13 = 52
		int count =0;
		for(int i=0;i<noOfPlayers;i++) {
		for(int j=0;j<noOfCardsToDistribute;j++ ) {
		players[i][j] = deckOFCards[count++];
		// 1 to 13 cards
		// 1 to 13 cards duplicate
		}
		}

		}


		// New method for randomly assigning the values


		void randomAssignCardsWithArray() {

		// 4 rows and 9 columns
		// 9 cards only
		// 9/4 = min one card and max 3 cards
		// player 1 = 1 card
		// player 2 = 2 card
		// player 3 = 2 cards
		// player 4 = 4 cards

		int[] assignCards = {2,2,2,3};
		int count =0;
		for(int i=0;i<noOfPlayers;i++) {
		for (int j = 0; j < assignCards[i]; j++) {
		players[i][j] = deckOFCards[count++];
		}
		}

		}


		//Random Assign the value using Arraylist

		void randomAssignCardsWithShuffle() {

		// 4 rows and 9 columns
		// 9 cards only
		// 9/4 = min one card and max 3 cards
		// player 1 = 1 card
		// player 2 = 3 card
		// player 3 = 2 cards
		// player 4 = 3 cards

		// 4 * 9 matrix


		ArrayList<Integer> randomIndex = new ArrayList<Integer>();
		randomIndex.add(1);
		randomIndex.add(3);
		randomIndex.add(2);
		randomIndex.add(3);
		Collections.shuffle(randomIndex);

		int count =0;
		for(int i=0;i<noOfPlayers;i++) {
		for (int j = 0; j < randomIndex.get(i); j++) {
		players[i][j] = deckOFCards[count++];
		}
		}
		}
		///===============// 4 Display the assigned card in 2d array

		void display() {
		for(int i=0;i<noOfPlayers;i++) {
		for(int j=0;j<noOfCardsToDistribute;j++) {

		if(players[i][j] == null){
		// Do nothing
		} else {
		System.out.print("P"+(i+1)+":"+players[i][j] + " ");
		}


		}
		System.out.println();
		}
		
		}
		public static void main(String[] args) {
			DeckOfCards deckOfCards2 = new DeckOfCards();
			// TODO Auto-generated method stub
			deckOfCards2.shuffleCards();
			//deckOfCards2.normallyAssignCards();
			deckOfCards2.randomAssignCardsWithArray();
			//deckOfCards2.randomAssignCardsWithShuffle();
			deckOfCards2.display();
			
	}
}