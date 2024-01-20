// Name: Iven Jacobson

// Date 1-19-24

// Project: Lab 2: Card Shuffling and Dealing Program 

// Purpose : This is the DeckOfCards class that holds the methods to contruct
// a standard deck of playing cards.

// I took the source code from the file below and modified it for this Lab.
// I modified the shuffle method to use the Fisher–Yates shuffle Algorithm
// instead of the one pass method in the original code.

// Fig. 7.12: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards.
import java.security.SecureRandom;

public class DeckOfCards {
   // random number generator
   private static final SecureRandom randomNumbers = new SecureRandom();
   private static final int NUMBER_OF_CARDS = 52; // constant # of Cards

   private Card[] deck = new Card[NUMBER_OF_CARDS]; // Card references
   private int currentCard = 0; // index of next Card to be dealt (0-51)

   // constructor fills deck of Cards
   public DeckOfCards() {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};    
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};      

      // populate deck with Card objects                   
      for (int count = 0; count < deck.length; count++) {  
         deck[count] =                                     
            new Card(faces[count % 13], suits[count / 13]);
      }                                                    
   } 

   // the original shuffle method that uses the one pass algorithm
   // shuffle deck of Cards with one-pass algorithm
   public void shuffle() {
      // next call to method dealCard should start at deck[0] again
      currentCard = 0; 

      // for each Card, pick another random Card (0-51) and swap them
      for (int first = 0; first < deck.length; first++) {
         // select a random number between 0 and 51 
         int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

         // swap current Card with randomly selected Card
         Card temp = deck[first];   
         deck[first] = deck[second];
         deck[second] = temp;       
      } 
   }

   // the modified shuffle that uses the Fisher-Yates algorithm
   // shuffle deck of Cards with Fisher-Yates algorithm
   public void fisherYatesShuffle() {
      // next call to method dealCard should start at deck[0] again
      currentCard = 0; 
   
      // for each Card (from the end to the start), pick another random Card (0 to current index) and swap them
      for (int original = deck.length - 1; original > 0; original--) {
         // select a random number between 0 and i 
         int shuffled = randomNumbers.nextInt(original + 1);
   
         // swap current Card with randomly selected Card
         Card temp = deck[original];   
         deck[original] = deck[shuffled];
         deck[shuffled] = temp;       
      } 
   }
   
      // deal one Card
   public Card dealCard() {
      // determine whether Cards remain to be dealt
      if (currentCard < deck.length) {
         return deck[currentCard++]; // return current Card in array
      } 
      else {
         return null; // return null to indicate that all Cards were dealt
      } 
   } 
} 



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
