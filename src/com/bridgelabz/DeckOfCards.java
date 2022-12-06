package com.bridgelabz;

public class DeckOfCards {
	
	static int playersPlaying = 4;
	static int cardsToBeDistributed = 9;

	public static void cardShuffling(String[] suit, String[] rank) {
		int[][] array = new int[suit.length][rank.length];
		String[] deck = new String[suit.length * rank.length];

		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				deck[suit.length * i + j] = rank[i] + "  " + suit[j];
			}
		}

		for (int i = 0; i < suit.length * rank.length; i++) {

			int random = (int) (Math.random() * (suit.length * rank.length));
			String temp = deck[random];
			deck[random] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < playersPlaying; i++) {

			array[i][0] = i + 1;

			System.out.println("\n Player " + " " + array[i][0] + "\n");
			
			
			
			for (int j = 0; j < cardsToBeDistributed; j++) {
				
				System.out.println(deck[i + j * playersPlaying]);	
				
			}
			
		}
		
	}
	
	
	public static void reaminingCards(String[] suit, String[] rank) {
		int[][] array = new int[suit.length][rank.length];
		String[] deck = new String[suit.length * rank.length];

		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				deck[suit.length * i + j] = rank[i] + "  " + suit[j];
				
			}
			
		}
		int remainingCard=16;
		
		for (int i = 0; i < remainingCard; i++) {
			
			int random = (int) (Math.random() * remainingCard);
			String temp = deck[random];
			deck[random] = deck[i];
			deck[i] = temp;
			
			System.out.println(deck[i]);
			
		}
	}
	

	public static void main(String[] args) {

		System.out.println("Welcome to Deck of Card game !");
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		cardShuffling(suit, rank);
		System.out.println();
		System.out.println();
		System.out.println("Remaining Cards are: ");
		reaminingCards(suit, rank);

	}

}


