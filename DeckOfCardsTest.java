// Name: Iven Jacobson

// Date 1-19-24

// Project: Lab 2: Card Shuffling and Dealing Program 

// Purpose : This is the Test class that calls the DeckOfCards class to
// create and shuffle a deck of cards.

// I took the source code from the file below and modified it for this Lab
// I added another block of code to print the unshuffled deck before the
// shuffled deck is printed.

// Fig. 7.13: DeckOfCardsTest.java
// Card shuffling and dealing.

public class DeckOfCardsTest {
   // execute application
   public static void main(String[] args) {
      DeckOfCards myDeckOfCards = new DeckOfCards();
      // print the cards before the shuffle
      System.out.println("Card's before shuffle:");
      for (int i = 1; i <= 52; i++) {
         // deal and display a Card
         System.out.printf("%-19s", myDeckOfCards.dealCard());

         if (i % 4 == 0) { // output a newline after every fourth card
            System.out.println();
         } 
      }
      myDeckOfCards.fisherYatesShuffle(); // place Cards in random order
      
      System.out.println();
      System.out.println("Card's after shuffle:");
      
      // print all 52 Cards in the order in which they are dealt
      for (int i = 1; i <= 52; i++) {
         // deal and display a Card
         System.out.printf("%-19s", myDeckOfCards.dealCard());

         if (i % 4 == 0) { // output a newline after every fourth card
            System.out.println();
         } 
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
