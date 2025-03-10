public class Card { //This class was made to reduce inefficiences and confusion (all methods shared by all card classes should be created in here)
    String name, type, typeText;
    String gameClass;
    private String leftPadding;
    private String rightPadding;
    String[] visual;
    int rank, stat;
    public static final String PURPLE = "\u001B[35m";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";





    /*
    This is the constructor (basically the outline and parameters) to create any type of card in the game (armour, helm, attack)
    The reason i made this is due to the reason stated above, it will be very inefficient to code the same constructor 3 - 4 times for all the card
    types. There will be more explanation on the armour card.
     */
    public Card(String name, int rank, String gameClass ,int stat, String type){
        String centeredNameText, centeredTypeText;
        int namePadding, typePadding;
        this.name = name;
        this.rank = rank;
        this.gameClass = gameClass; // can remove later if not needed
        this.stat = stat;
        this.type = type;

        //10 is the amount of spaces betwen the | | symbols in the card
        namePadding = (10 - this.name.length())/2; //this creates an equal padding for both sides
        typePadding = (10 - this.type.length())/2;

        centeredNameText = String.format("%" + (namePadding + this.name.length()) + "s", this.name); //gets the string with the left padding EX: |__Dagger|
        centeredNameText = String.format("%-10s", centeredNameText); //Brings the __Dagger to the left with whatever remaining to the right EX:|__Dagger__|


        centeredTypeText = String.format("%" + (typePadding +this.type.length()) + "s", this.type);
        centeredTypeText = String.format("%-10s", centeredTypeText);
        // --> 10 spaces total

        //initializes what the card's visual looks like
        this.visual = new String[]{
                "┌──────────┐",
                "│"+RED+this.rank+RESET+"         │",
                "│          │",//space length = 11
                "│"+centeredNameText +"│",
                "│          │",
                "│" +PURPLE + centeredTypeText+ RESET+"│",
                "└──────────┘"
        };



    }
}
