package wargame;



public class deckOfCards {
	   public static final int NEWCARDS = 52;
	   private Cards[] deckOfCards;         // Contains all 52 cards
	   private int currentCard;            // deal THIS card in deck

	public deckOfCards( ) {
	  deckOfCards = new Cards[NEWCARDS];
	  int i = 0;

	  for ( int suit = Cards.DIAMOND; suit <= Cards.SPADE; suit++ )
	     for ( int rank = 1; rank <= 13; rank++ )
	         deckOfCards[i++] = new Cards(suit, rank);
	         setCurrentCard(0);
	 }

	
	   //shuffle(n): shuffle the deck
	   public void shuffle(int n) {
	      int i, j, k;
	      for ( k = 0; k < n; k++ ) {
	          i = (int) ( NEWCARDS * Math.random() );  // Pick 2 random cards
	          j = (int) ( NEWCARDS * Math.random() );  // in the deck?

	  //swap these randomly picked cards
	      Cards temp = deckOfCards[i];
	      deckOfCards[i] = deckOfCards[j];
	      deckOfCards[j] = temp;
	   }
	  setCurrentCard(0);   // Reset current card to deal
	  }

	  
	public int getCurrentCard() {
		return currentCard;
	}


	public void setCurrentCard(int currentCard) {
		this.currentCard = currentCard;
	}

	@Override public String toString() {
		  return "DeckOfCards";

}
	{


	   }
	public Cards dealCard() {
		Cards theCard;
        if (currentCard < deckOfCards.length) {
            theCard = deckOfCards[currentCard];
            currentCard++;
        }
        else
            theCard = null;

        return theCard;
	
	}

		
	}


	
		
	

