import greenfoot.*;
import java.util.ArrayList;

/**
 * This class declares, instantiates, and initializes a new deck.  Students 
 * should then implement the sort method at the botton of this class to see 
 * if they understanding basic ArrayList sort algorithms.
 * 
 * @author 
 * @version 
 */

public class Dealer extends Actor
{
    private Deck deck;
    private Card[] shuffledDeck;
    private Card[] selectionSort;
    private Card[] insertionSort;
    private Card[] mergeSort;
    
    // Instantiates a new deck
    public Dealer()
    {
        deck = new Deck();
        shuffledDeck = deck.getShuffledDeck();
        initializeSortArrays();
    }
    
    // Adds cards to board after Deck is initialized
    public void addedToWorld(World world)
    {
        showCards(world, shuffledDeck, 80);
        showCards(world, selectionSort(selectionSort, shuffledDeck.length), 220);
        showCards(world, insertionSort(insertionSort, shuffledDeck.length), 360);
        showCards(world, mergeSort(mergeSort, shuffledDeck.length), 500);
    }    
    // Shuffles the unshuffled deck
    
    
    // Sets all the sorted arrays equal to the shuffledCard array
    private void initializeSortArrays()
    {
        selectionSort = new Card[shuffledDeck.length];
        insertionSort = new Card[shuffledDeck.length];
        mergeSort = new Card[shuffledDeck.length];
        
        for(int i = 0; i < shuffledDeck.length; i++)
        { 
            Card card1 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card2 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card3 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            selectionSort[i] = card1;
            insertionSort[i] = card2;
            mergeSort[i] = card3;
        }
    }
    
    // Places card on board at y
    private void showCards(World world, Card[] cards, int y)
    {
        
       for(int i = 0; i < cards.length; i++)
       {
           world.addObject(cards[i],58 + 30 * i, y);
       } 
    }
    
    /* This is where the students attempt their sort algorithm by taking the
     * cards from the shuffled list and adding them to the sorted list.     
    **/
    
    /* In this space write the pseudocode for your selection sort
     * Start from the first element and assume it is the smallest.
     * Scan the rest of the array to find the actual smallest element.
     * Swap the smallest element with the current position.
     * Move to the next position and repeat until the entire array is sorted.
     */
    private Card[] selectionSort(Card[] arr, int n)
    {
        //put sort algorithm here
        for (int i = 0; i < n; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if ( arr[j].getValue() < arr[minIndex].getValue())
                {
                    minIndex = j;
                }
            }
            Card temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return selectionSort;
    }
    
    /* In this space write the pseudocode for your insertion sort
     * Start with the second element, considering the first element as sorted.
     * Compare it with elements in the sorted section and shift larger elements 
     * to the right.
     * Insert the current element into its correct position.
     * Repeat for each element until the entire array is sorted.
     */
    private Card[] insertionSort(Card[] arr, int n)
    {
        //put sort algorithm here
        for (int i = 1; i < n; i++) 
        {
            Card key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j].getValue() > key.getValue()) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
        }
        return insertionSort;
    }
    
    /* In this space write the pseudocode for your merge sort
     * 
     * 
     * 
     */
    private Card[] mergeSort(Card[] arr, int n)
     {
        
        //put sort algorithm here
        
        return mergeSort;
    }
}

