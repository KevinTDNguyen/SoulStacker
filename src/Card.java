public class Card { //This class was made to reduce inefficiences and confusion (all methods shared by all card classes should be created in here)
    String name;
    int rank, stat;

    /*
    This is the constructor (basically the outline and parameters) to create any type of card in the game (armour, helm, attack)
    The reason i made this is due to the reason stated above, it will be very inefficient to code the same constructor 3 - 4 times for all the card
    types. There will be more explanation on the armour card.
     */
    public Card(String name, int rank, int stat){
        this.name = name;
        this.rank = rank;
        this.stat = stat;
    }
}
