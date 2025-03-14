
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner scanS = new Scanner(System.in);
    static Scanner scanN = new Scanner(System.in);
    public static final String PURPLE = "\u001B[35m";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    static ArrayList <Card> berserkerDeck = new ArrayList<>();
    static ArrayList <Card> sorcererDeck = new ArrayList<>();
    static ArrayList <Card> playerDeck = new ArrayList<>();
    static ArrayList <Card> playerHand = new ArrayList<>();
    public static void init_sorcerer(){
        //Weapons
        sorcererDeck.add(new WeaponCard("Dagger", 1,2, "WEAPON"));
        sorcererDeck.add(new WeaponCard("Dagger", 1,2, "WEAPON"));
        sorcererDeck.add(new WeaponCard("Nunchuks", 2,4, "WEAPON"));
        sorcererDeck.add(new WeaponCard("Nunchuks", 2,4, "WEAPON"));
        sorcererDeck.add(new WeaponCard("Bo Staff", 3,6, "WEAPON"));
        sorcererDeck.add(new WeaponCard("Bo Staff", 3,6, "WEAPON"));
        sorcererDeck.add(new WeaponCard("Steel Claw", 4,9, "WEAPON"));

        //Helms
        sorcererDeck.add(new HelmCard("Brass Helmet", 1,2, "HELMET"));
        sorcererDeck.add(new HelmCard("Brass Helmet", 1,2, "HELMET"));
        sorcererDeck.add(new HelmCard("Snake Mask", 2,4, "HELMET"));
        sorcererDeck.add(new HelmCard("Snake Mask", 2,4, "HELMET"));

        //Armours
        sorcererDeck.add(new ArmourCard("Robe", 1,1, "ARMOUR"));
        sorcererDeck.add(new ArmourCard("Robe", 1,1, "ARMOUR"));
        sorcererDeck.add(new ArmourCard("Old Jacket", 2,4, "ARMOUR"));
        sorcererDeck.add(new ArmourCard("Old Jacket", 2,4, "ARMOUR"));
        sorcererDeck.add(new ArmourCard("Gold Cloak", 2,4, "ARMOUR"));
    }

    public  static void init_berserker(){
        //Weapons
        berserkerDeck.add(new WeaponCard("Hammer", 1, 2, "WEAPON"));
        berserkerDeck.add(new WeaponCard("Hammer", 1, 2, "WEAPON"));
        berserkerDeck.add(new WeaponCard("Hammer", 1, 2, "WEAPON"));
        berserkerDeck.add(new WeaponCard("Hammer", 1, 2, "WEAPON"));
        berserkerDeck.add(new WeaponCard("Hand-Spike", 2, 4, "WEAPON"));
        berserkerDeck.add(new WeaponCard("Hand-Spike", 2, 4, "WEAPON"));
        berserkerDeck.add(new WeaponCard("Hand-Spike", 2, 4, "WEAPON"));
        berserkerDeck.add(new WeaponCard("Broadsword", 3, 7, "WEAPON"));
        berserkerDeck.add(new WeaponCard("Broadsword", 3, 7, "WEAPON"));
        berserkerDeck.add(new WeaponCard("Grimm-Axe", 4, 12, "WEAPON"));
        // Helms
        berserkerDeck.add(new HelmCard("Iron Bucket", 1, 1, "HELMET"));
        berserkerDeck.add(new HelmCard("Iron Bucket", 1, 1, "HELMET"));
        berserkerDeck.add(new HelmCard("Bucket(II)", 2, 3, "HELMET"));
        berserkerDeck.add(new HelmCard("Bucket(II)", 2, 3, "HELMET"));
        berserkerDeck.add(new HelmCard("Great Helm", 3, 6, "HELMET"));
        // Armor
        berserkerDeck.add(new ArmourCard("Rags", 1, 1, "ARMOUR"));
        berserkerDeck.add(new ArmourCard("Rags", 1, 1, "ARMOUR"));
        berserkerDeck.add(new ArmourCard("Carapace", 2, 4, "ARMOUR"));
        berserkerDeck.add(new ArmourCard("Carapace", 2, 4, "ARMOUR"));
        berserkerDeck.add(new ArmourCard("Chainmail", 4, 7, "ARMOUR"));
        berserkerDeck.add(new ArmourCard("Berserker", 4, 12, "ARMOUR"));
    }

    public static void main(String[] args) {

        Shadow player = new Shadow("Kevin", 100, 25, "");
        Shadow comp = new Shadow("Skeilgodr", 100, 25, "");

        //initializes the empty card slots
        Card emptyWeapon = new Card("EMPTY", 0, 0, "WEAPON");
        Card emptyHelm = new Card("EMPTY", 0, 0, "HELMET");
        Card emptyArmour = new Card("EMPTY", 0, 0, "ARMOUR");

        init_berserker();
        init_sorcerer();
        introMenu(player);
        gamePlay(player, comp);



        // Adding objects to player deck. I changed it from the last one


        //test
        Card[] slots = new Card[] {emptyWeapon, emptyWeapon, emptyHelm, emptyArmour};

        for (int i = 0; i < playerDeck.size(); i++) {
            System.out.println(playerDeck.get(i).name);
        }

        printSlots(slots);

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

    }

    /**
     * Method Name: tutorial
     * Desc: Displays the game's instructions/tutorial
     */
    public static void tutorial() {
        System.out.println(RED + "TUTORIAL: " + RESET);
        System.out.println(PURPLE+"OBJECTIVE:"+ RESET + "\nThe goal is to upgrade your base shadow using other cards, to beat your opponent by taking their health to 0.\n There are 3 types of cards, armor, weapon, and ability cards.\nThe user can place these cards on their base shadow to give the shadow additional defense, attack, health, etc.");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(PURPLE+"GAMEPLAY"+ RESET);
        System.out.println("Both players start with a basic shadow, and 4 additional cards.\nThe player can have 1 helm card 1 armor card, 2 weapon cards, and unlimited ability cards active on their shadow.\nTo upgrade armor or weapons, the active card must be one rank lower of the card you wish to play. \nYou can either draw a card and build your shadow, or attack the opponent and build your shadow.");
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public static void drawCard(ArrayList<Card> hand, ArrayList<Card> playerDeck) {
        if(playerDeck.isEmpty())
            System.out.println("There are no more cards left to draw.\n");

        else{
            int index = (int)(0+Math.random() * playerDeck.size());
            hand.add(playerDeck.get(index));
            playerDeck.remove(index);

        }

    }

    //some messing around
    public static void printSlots(Card[] cards){
        for (int i = 0; i < 7; i++) {
            System.out.println(cards[0].visual[i] + " " + cards[1].visual[i] + " " + cards[2].visual[i] + " " + cards[3].visual[i]);

        }
    }

    public  static void gamePlay(Shadow player, Shadow comp){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("What is your name?: ");
        player.name = scanS.nextLine();
        do {
            System.out.println("What class do you want to play?(The computer plays the other one)\n* Berserker\n* Sorcerer");
            player.playerClass = scanS.nextLine();

            if(!player.playerClass.equalsIgnoreCase("berserker") && !player.playerClass.equalsIgnoreCase("sorcerer"))
                System.out.println("Not an available Class. Try Again Please.");

        }while(!player.playerClass.equalsIgnoreCase("berserker") && !player.playerClass.equalsIgnoreCase("sorcerer"));

        if (player.playerClass.equalsIgnoreCase("berserker"))
            playerDeck = berserkerDeck;

        else
            playerDeck = sorcererDeck;
        //-----------------------------------
        // Drawing the first 4 cards.
        System.out.println("DRAWING FIRST 4 CARDS!");
        System.out.format("%20s %2s %15s %2s %15s %2s %15s", "NAME", "|", "RANK", "|", "STAT", "|", "CARD-TYPE");
        for(int i = 0; i<4; i++){
            //To Add Animation=> Thread.sleep(80);
            drawCard(playerHand, playerDeck);
            System.out.println("");
            System.out.format("%20s %2s %15s %2s %15s %2s %15s", playerHand.get(i).name, "|", playerHand.get(i).rank, "|", playerHand.get(i).stat, "|", playerHand.get(i).type);
        }
    }
}
