
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Shadow player = new Shadow("Kevin", 100, 25, "sorcerer");
        Shadow comp = new Shadow("Skeilgodr", 100, 25, "berserker");

        //examples of how to setup different objects using the classes i modified/created - kevin
        WeaponCard dagger = new WeaponCard("Dagger", 1, 1, "Weapon");
        WeaponCard hammer = new WeaponCard("Hammer", 1, 2, "Weapon");
        WeaponCard sKnuckles = new WeaponCard("S Knuckles", 2, 4, "Weapon");
        WeaponCard broadsword = new WeaponCard("Broadsword", 3, 7, "Weapon");
        ArmourCard rags = new ArmourCard("Rags", 1, 1, "Armour");
        HelmCard greatHelm = new HelmCard("Great Helm", 3, 6, "Helmet");


        //DECK OF CARD OBJECTS --> WeaponCard, HelmCard and ArmourCard count as Card class because cardClass is it's super class (parent class)
        ArrayList <Card> deck = new ArrayList<>();
        ArrayList <Card> playerHand = new ArrayList<>();

        //test
        Card[] slots = new Card[] {dagger, rags};

        //Adding objects to deck
        deck.add(dagger);
        deck.add(greatHelm);
        deck.add(hammer);
        deck.add(sKnuckles);
        deck.add(broadsword);
        deck.add(rags);


        drawCard(playerHand,deck);
        System.out.println(playerHand.get(0).name);
        System.out.println();

        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).name);
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
        System.out.println("\n" +
                "   ▄████████  ▄██████▄  ███    █▄   ▄█               ▄████████     ███        ▄████████  ▄████████    ▄█   ▄█▄    ▄████████    ▄████████ \n" +
                "  ███    ███ ███    ███ ███    ███ ███              ███    ███ ▀█████████▄   ███    ███ ███    ███   ███ ▄███▀   ███    ███   ███    ███ \n" +
                "  ███    █▀  ███    ███ ███    ███ ███              ███    █▀     ▀███▀▀██   ███    ███ ███    █▀    ███▐██▀     ███    █▀    ███    ███ \n" +
                "  ███        ███    ███ ███    ███ ███              ███            ███   ▀   ███    ███ ███         ▄█████▀     ▄███▄▄▄      ▄███▄▄▄▄██▀ \n" +
                "▀███████████ ███    ███ ███    ███ ███            ▀███████████     ███     ▀███████████ ███        ▀▀█████▄    ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   \n" +
                "         ███ ███    ███ ███    ███ ███                     ███     ███       ███    ███ ███    █▄    ███▐██▄     ███    █▄  ▀███████████ \n" +
                "   ▄█    ███ ███    ███ ███    ███ ███▌    ▄         ▄█    ███     ███       ███    ███ ███    ███   ███ ▀███▄   ███    ███   ███    ███ \n" +
                " ▄████████▀   ▀██████▀  ████████▀  █████▄▄██       ▄████████▀     ▄████▀     ███    █▀  ████████▀    ███   ▀█▀   ██████████   ███    ███ \n" +
                "                                   ▀                                                                 ▀                        ███    ███ \n");

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

    public static void drawCard(ArrayList<Card> hand, ArrayList<Card> deck) {
        int index = (int)(0+Math.random() * deck.size());
        hand.add(deck.get(index));
        deck.remove(index);

    }

    //some messing around
    public static void printSlots(Card[] cards){
        for (int i = 0; i < 7; i++) {
            System.out.println(cards[0].visual[i] + " " + cards[1].visual[i]);

        }
    }


}

