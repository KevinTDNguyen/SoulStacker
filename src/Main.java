
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static final String PURPLE = "\u001B[45m";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";


    public static void main(String[] args) {

        Shadow player = new Shadow("Kevin", 100, 25, "sorcerer");
        Shadow comp = new Shadow("Skeilgodr", 100, 25, "berserker");
        introMenu(player);


        //playerDeck OF CARD OBJECTS --> WeaponCard, HelmCard and ArmourCard count as Card class because cardClass is it's super class (parent class)
        ArrayList <Card> playerDeck = new ArrayList<>();
        // Adding objects to player deck. I changed it from the last one
        playerDeck.add(new WeaponCard("Dagger", 1, "sorcerer",1, "Weapon"));
        playerDeck.add(new WeaponCard("Nunchuks", 2, "sorcerer",4, "Weapon"));
        playerDeck.add(new WeaponCard("Bo Staff", 3, "sorcerer",6, "Weapon"));
        playerDeck.add(new WeaponCard("Steel Claw", 4, "sorcerer",9, "Weapon"));
        playerDeck.add(new ArmourCard("Robe", 1, "sorcerer",1, "Armour"));
        playerDeck.add(new HelmCard("Snake Mask", 2, "sorcerer",4, "Helmet"));
        playerDeck.add(new HelmCard("Brass Helmet", 1, "sorcerer",2, "Helmet"));
        ArrayList <Card> playerHand = new ArrayList<>();

        //test
        Card[] slots = new Card[] {playerDeck.get(1), playerDeck.get(2)};


        drawCard(playerHand,playerDeck);
        System.out.println(playerHand.get(0).name);
        System.out.println();

        for (int i = 0; i < playerDeck.size(); i++) {
            System.out.println(playerDeck.get(i).name);
        }

        printSlots(slots);

        //introMenu(player);

        //Examples of how this works, be free to delete once concepts are understood




    }

    /**
     * Method Name: clearScreen
     * Desc: clears the screen
     */
    public static void clearScreen(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    /**
     * Method Name: introMenu
     * Desc: shows the title page and has a tutorial to the game
     * @param player
     */
    public static void introMenu(Shadow player){
        Scanner scanS = new Scanner(System.in);
        String insAns;
        System.out.println(RED + "\n" +
                "   ▄████████  ▄██████▄  ███    █▄   ▄█               ▄████████     ███        ▄████████  ▄████████    ▄█   ▄█▄    ▄████████    ▄████████ \n" +
                "  ███    ███ ███    ███ ███    ███ ███              ███    ███ ▀█████████▄   ███    ███ ███    ███   ███ ▄███▀   ███    ███   ███    ███ \n" +
                "  ███    █▀  ███    ███ ███    ███ ███              ███    █▀     ▀███▀▀██   ███    ███ ███    █▀    ███▐██▀     ███    █▀    ███    ███ \n" +
                "  ███        ███    ███ ███    ███ ███              ███            ███   ▀   ███    ███ ███         ▄█████▀     ▄███▄▄▄      ▄███▄▄▄▄██▀ \n" +
                "▀███████████ ███    ███ ███    ███ ███            ▀███████████     ███     ▀███████████ ███        ▀▀█████▄    ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   \n" +
                "         ███ ███    ███ ███    ███ ███                     ███     ███       ███    ███ ███    █▄    ███▐██▄     ███    █▄  ▀███████████ \n" +
                "   ▄█    ███ ███    ███ ███    ███ ███▌    ▄         ▄█    ███     ███       ███    ███ ███    ███   ███ ▀███▄   ███    ███   ███    ███ \n" +
                " ▄████████▀   ▀██████▀  ████████▀  █████▄▄██       ▄████████▀     ▄████▀     ███    █▀  ████████▀    ███   ▀█▀   ██████████   ███    ███ \n" +
                "                                   ▀                                                                 ▀                        ███    ███ \n" + RESET);

        while (true){
            System.out.print("\nWould you like to read the tutorial? (Y/N): ");
            insAns = scanS.nextLine();

            if (insAns.equalsIgnoreCase("N"))
                break;

            else if (insAns.equalsIgnoreCase("Y")) {
                clearScreen();
                tutorial();
                break;
            }

            System.out.println("ERROR: Input a valid input");
        }
        clearScreen();

        System.out.print("What is your name?: ");
        player.name = scanS.nextLine();
    }

    /**
     * Method Name: tutorial
     * Desc: Displays the game's instructions/tutorial
     */
    public static void tutorial() {
        System.out.println("TUTORIAL...");
    }

    public static void drawCard(ArrayList<Card> hand, ArrayList<Card> playerDeck) {
        if(playerDeck.isEmpty()){
            System.out.println("There are no more cards left to draw.\n");
        }else{
            int index = (int)(0+Math.random() * playerDeck.size());
            hand.add(playerDeck.get(index));
            playerDeck.remove(index);
        }

    }

    //some messing around
    public static void printSlots(Card[] cards){
        for (int i = 0; i < 7; i++) {
            System.out.println(cards[0].visual[i] + " " + cards[1].visual[i]);

        }
    }


}

