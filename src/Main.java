import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    //Global Declarations
    //Libraries
    static Scanner scanS = new Scanner(System.in);
    static Scanner scanN = new Scanner(System.in);
    static Random random = new Random();

    //Colours
    public static final String PURPLE = "\u001B[35m";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    //Card Decks and slots
    static ArrayList <Card> berserkerDeck = new ArrayList<>();
    static ArrayList <Card> sorcererDeck = new ArrayList<>();
    static ArrayList <Card> playerDeck = new ArrayList<>();
    static ArrayList <Card> compDeck = new ArrayList<>();
    static Card[] compSlots = new Card[5];
    static Card[] playerSlots = new Card[5];

    //Shadow stats and ability trackers
    static int turn = 0;
    static int damageDealt;
    static int pBaseDamage = 0;
    static int cBaseDamage = 0;
    static int pBaseDefense = 0;
    static int cBaseDefense = 0;
    static boolean trueAim = false;
    static boolean forceField = false;
    static boolean everGreen = false;
    //static boolean poison = false;
    static int poison = 0;
    static int[] abilityHandler = {0, 0, 0, 0 ,0 ,0, 0, 0};



    //Initializing Sorcerer Deck
    public static void init_sorcerer(){
        //Weapons
        sorcererDeck.add(new WeaponCard("Dagger", 1,2, "WEAPON", ""));
        sorcererDeck.add(new WeaponCard("Dagger", 1,2, "WEAPON", ""));
        sorcererDeck.add(new WeaponCard("Nunchuks", 2,4, "WEAPON", ""));
        sorcererDeck.add(new WeaponCard("Nunchuks", 2,4, "WEAPON", ""));
        sorcererDeck.add(new WeaponCard("Bo Staff", 3,6, "WEAPON", ""));
        sorcererDeck.add(new WeaponCard("Bo Staff", 3,6, "WEAPON", ""));
        sorcererDeck.add(new WeaponCard("Iron Claw", 4,9, "WEAPON", ""));
        sorcererDeck.add(new WeaponCard("Iron Claw", 4,9, "WEAPON", ""));

        //Helms
        sorcererDeck.add(new HelmCard("Brass Helm", 1,2, "HELMET", ""));
        sorcererDeck.add(new HelmCard("Brass Helm", 1,2, "HELMET", ""));
        sorcererDeck.add(new HelmCard("Snake Mask", 2,4, "HELMET", ""));
        sorcererDeck.add(new HelmCard("Snake Mask", 2,4, "HELMET", ""));
        sorcererDeck.add(new HelmCard("Soul Mask", 3,6, "HELMET", ""));


        //Armours
        sorcererDeck.add(new ArmourCard("Robe", 1,1, "ARMOUR", ""));
        sorcererDeck.add(new ArmourCard("Robe", 1,1, "ARMOUR", ""));
        sorcererDeck.add(new ArmourCard("Old Jacket", 2,4, "ARMOUR", ""));
        sorcererDeck.add(new ArmourCard("Old Jacket", 2,4, "ARMOUR", ""));
        sorcererDeck.add(new ArmourCard("Fire Cloak", 3,7, "ARMOUR", ""));

        //Abilities
        sorcererDeck.add(new AbilityCard("Rest", 1, 1, "ABILITY", "Heal 6"));
        sorcererDeck.add(new AbilityCard("Rest", 1, 1, "ABILITY", "Heal 6"));
        sorcererDeck.add(new AbilityCard("True Aim", 1, 1, "ABILITY","Attack on next turn ignores defense"));
        sorcererDeck.add(new AbilityCard("Poison", 1,2, "ABILITY","Enemy takes 5 damage for next 2 turns"));
        sorcererDeck.add(new AbilityCard("Poison", 1,2, "ABILITY","Enemy takes 5 damage for next 2 turns"));
        sorcererDeck.add(new AbilityCard("Barrier", 1, 1, "ABILITY", "Opponent can't attack you next turn."));
        sorcererDeck.add(new AbilityCard("Barrier", 1, 1, "ABILITY", "Opponent can't attack you next turn."));
        sorcererDeck.add(new AbilityCard("Barrier", 1, 1, "ABILITY", "Opponent can't attack you next turn."));
    }

    //Initializing Berserker Deck
    public  static void init_berserker(){
        //Weapons
        berserkerDeck.add(new WeaponCard("Hammer", 1, 2, "WEAPON",""));
        berserkerDeck.add(new WeaponCard("Hammer", 1, 2, "WEAPON", ""));
        berserkerDeck.add(new WeaponCard("Hammer", 1, 2, "WEAPON", ""));
        berserkerDeck.add(new WeaponCard("Hammer", 1, 2, "WEAPON", ""));
        berserkerDeck.add(new WeaponCard("Hand-Spike", 2, 4, "WEAPON", ""));
        berserkerDeck.add(new WeaponCard("Hand-Spike", 2, 4, "WEAPON", ""));
        berserkerDeck.add(new WeaponCard("Hand-Spike", 2, 4, "WEAPON", ""));
        berserkerDeck.add(new WeaponCard("Broadsword", 3, 7, "WEAPON", ""));
        berserkerDeck.add(new WeaponCard("Broadsword", 3, 7, "WEAPON", ""));
        berserkerDeck.add(new WeaponCard("Grimm-Axe", 4, 12, "WEAPON", ""));
        // Helms
        berserkerDeck.add(new HelmCard("Old Bucket", 1, 1, "HELMET", ""));
        berserkerDeck.add(new HelmCard("Old Bucket", 1, 1, "HELMET", ""));
        berserkerDeck.add(new HelmCard("New Bucket", 2, 3, "HELMET", ""));
        berserkerDeck.add(new HelmCard("New Bucket", 2, 3, "HELMET", ""));
        berserkerDeck.add(new HelmCard("Great Helm", 3, 6, "HELMET", ""));
        // Armours
        berserkerDeck.add(new ArmourCard("Rags", 1, 1, "ARMOUR", ""));
        berserkerDeck.add(new ArmourCard("Rags", 1, 1, "ARMOUR", ""));
        berserkerDeck.add(new ArmourCard("Carapace", 2, 4, "ARMOUR", ""));
        berserkerDeck.add(new ArmourCard("Carapace", 2, 4, "ARMOUR", ""));
        berserkerDeck.add(new ArmourCard("Chainmail", 4, 7, "ARMOUR", ""));
        berserkerDeck.add(new ArmourCard("Berserker", 4, 12, "ARMOUR", ""));

        //Abilities
        berserkerDeck.add(new AbilityCard("Rage", 1,1, "ABILITY", "+2 Attack and +1 Defense"));
        berserkerDeck.add(new AbilityCard("Fire Token", 1, 1, "ABILITY", "+1 Attack"));
        berserkerDeck.add(new AbilityCard("Fire Token", 1, 1, "ABILITY", "+1 Attack"));
        berserkerDeck.add(new AbilityCard("Rest", 1, 1, "ABILITY", "Heal 6"));
        berserkerDeck.add(new AbilityCard("Rest", 1, 1, "ABILITY", "Heal 6"));
    }

    public static void main(String[] args) {
        //Setting up player and computer objects
        Shadow player = new Shadow("Kevin", 50, 1, 0,"");
        Shadow comp = new Shadow("Opponent", 50, 1, 0, "");

        //initializes the empty card slots
        Card emptyWeapon = new Card("EMPTY", 0, 0, "WEAPON", "");
        Card emptyHelm = new Card("EMPTY", 0, 0, "HELMET", "");
        Card emptyArmour = new Card("EMPTY", 0, 0, "ARMOUR", "");
        Card emptyAbility = new Card("EMPTY", 0, 0, "ABILITY", "");

        init_berserker();
        init_sorcerer();

        ArrayList <Card> compHand = new ArrayList<>();
        compSlots[0] = emptyWeapon;
        compSlots[1] = emptyWeapon;
        compSlots[2] = emptyHelm;
        compSlots[3] = emptyArmour;
        compSlots[4] = emptyAbility;
        ArrayList <Card> playerHand = new ArrayList<>();

        //Begins the playerSlots with empty cards
        playerSlots[0] = emptyWeapon;
        playerSlots[1] = emptyWeapon;
        playerSlots[2] = emptyHelm;
        playerSlots[3] = emptyArmour;
        playerSlots[4] = emptyAbility;


        introMenu(player);
        gamePlay(player, comp, playerHand, compHand);
    }

    /**
     * Method Name: clearScreen
     * Desc: clears the screen
     */
    public static void clearScreen(){
        for (int i = 0; i < 10; i++) {
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
        //clearScreen();

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

    public static int attack(Shadow player, Shadow comp){
        damageDealt = player.atkDamage - comp.defense;
        if(forceField){
            System.out.println(GREEN + "User cannot be attacked, due to a Force Field." + RESET);
        }
        else{
            if(trueAim) {
                damageDealt = player.atkDamage;
                System.out.println(RED + "The attack on the next turn will ignore defense." + RESET);
            }
            if(damageDealt>0){
                comp.hp = comp.hp - damageDealt;
                return damageDealt;
            }
            else if(damageDealt<=0){
                comp.hp-=1;
                damageDealt = 1;
            }
        }
        return damageDealt;
    }

    public static void displaySlots(Card[] cards){
        for (int i = 0; i < 7; i++) {
            System.out.println(cards[0].visual[i] + " " + cards[1].visual[i] + " " + cards[2].visual[i] + " " + cards[3].visual[i] + " " + cards[4].visual[i]);
        }
    }

    public static void displayStats(Shadow player){
        System.out.println("STATS: " + player.playerClass + " | " + player.name + " | " + GREEN + "Health: " + player.hp + RESET + " | " + "Attack: " + player.atkDamage + " | " + "Defense: " + player.defense + " | ");
    }

    public static void upgradeStats(Shadow player, Card [] playerSlots, int buildChoice){
        int baseDamage;
        int baseDefense;
        if(player.name.equalsIgnoreCase("Opponent")){
            baseDamage = cBaseDamage;
            baseDefense = cBaseDefense;
        }
        else {
          baseDamage = pBaseDamage;
          baseDefense = pBaseDefense;
        }

        switch (buildChoice){
            case 0:
                player.atkDamage = playerSlots[1].stat + baseDamage;
                player.atkDamage += playerSlots[buildChoice].stat;
                break;

            case 1:
                player.atkDamage = playerSlots[0].stat + baseDamage;
                player.atkDamage+= playerSlots[buildChoice].stat;
                break;

            case 2:
                player.defense = playerSlots[3].stat + baseDefense;
                player.defense+=playerSlots[buildChoice].stat;
                break;

            case 3:
                player.defense = playerSlots[2].stat + baseDefense;
                player.defense+=playerSlots[buildChoice].stat;
                break;

            default:
                player.atkDamage = playerSlots[0].stat + playerSlots[1].stat + baseDamage;
                player.defense = playerSlots[2].stat + playerSlots[3].stat + baseDefense;
                break;
        }
        displayStats(player);
    }

    public static void gamePlay(Shadow player, Shadow comp, ArrayList <Card> playerHand, ArrayList <Card> compHand) {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("What is your name?: ");
        player.name = scanS.nextLine();
        do {
            System.out.println("What class do you want to play?(The computer plays the other one)\n* Berserker\n* Sorcerer");
            player.playerClass = scanS.nextLine();

            if (!player.playerClass.equalsIgnoreCase("berserker") && !player.playerClass.equalsIgnoreCase("sorcerer"))
                System.out.println("Not an available Class. Try Again Please.");

        } while (!player.playerClass.equalsIgnoreCase("berserker") && !player.playerClass.equalsIgnoreCase("sorcerer"));

        if (player.playerClass.equalsIgnoreCase("berserker")){
            playerDeck = berserkerDeck;
            //player.playerClass = "Berserker";
            compDeck = sorcererDeck;
            comp.playerClass = "Sorcerer";
        }
        else{
            playerDeck = sorcererDeck;
            //player.playerClass = "Sorcerer";
            compDeck = berserkerDeck;
            comp.playerClass = "Berserker";
        }

        clearScreen();

        // Drawing the first 4 cards.
        System.out.println("DRAWING YOUR FIRST 4 CARDS!\n");
        System.out.format("%-20s %-2s %-15s %-2s %-15s %-2s %-15s", "NAME", "|", "RANK", "|", "STAT", "|", "CARD-TYPE");
        for (int i = 0; i < 4; i++) {
            //To Add Animation=> Thread.sleep(80);
            drawCard(compHand, compDeck);
            drawCard(playerHand, playerDeck);
            System.out.println();
            System.out.format("%-20s %-2s %-15s %-2s %-15s %-2s %-15s", playerHand.get(i).name, "|", playerHand.get(i).rank, "|", playerHand.get(i).stat, "|", playerHand.get(i).type);
        }
        System.out.println("\n");
        displayStats(player);

        int playChoice = 0;
        while(player.hp > 0 && comp.hp>0){
            playChoice = 0;
            turn++;
            System.out.println("TURN: " + turn + "\n-------------------------------------------------");
            System.out.println("YOUR TURN");
            displaySlots(compSlots);
            displayStats(comp);
            displaySlots(playerSlots);
            displayStats(player);
            if(player.playerClass.equalsIgnoreCase("Sorcerer")){
                if(forceField){
                    forceField=false;
                }
                poisonAbility(comp, player);
                everGreenAbility(player);
            }
            while(playChoice!=1 && playChoice!=2){
                System.out.println("What do you want to do?\n1. Attack\n2. Draw");
                playChoice = scanN.nextInt();
                switch (playChoice){
                    case 1:

                        System.out.println(RED + "You dealt " + attack(player, comp) + " damage to the opponent." + RESET);
                        break;
                    case 2:
                        drawCard(playerHand, playerDeck);
                        System.out.println("You drew a card.");
                        break;
                    default:
                        System.out.println("Not a choice. Try Again.");
                        break;
                }
            }
            if(player.hp<=0 || comp.hp<=0){
                winMessage(player);
                break;
            }

            buildSlot(player, playerHand);
            if(trueAim && player.playerClass.equalsIgnoreCase("Sorcerer")){
                trueAim = false;
            }

            //Comp Part
            System.out.println("OPPONENT TURN\n---------------------------------");
            compOpponent(turn, compSlots, player, comp, compHand);
        }

    }

    public static int buildSlot(Shadow player, ArrayList <Card> playerHand){
        int catAns, selectCard = 0, buildChoice = 0; //cat ans is category/type of card answer
        String cardType = "", statType = "", returnMenu;
        ArrayList <Card> typeCardArray = new ArrayList<>();

        while(true) {
            clearScreen();
            typeCardArray.clear(); // sets up the ArrayList that will be used to display cards in a certain type
            catAns = buildSlotMenu1(); // grabs the card type desired
            switch (catAns) {
                case 1: // sets the necessary variables for menu display
                    cardType = "WEAPON";
                    statType = "ATK";
                    break;

                case 2:
                    cardType = "HELMET";
                    statType = "DEF";
                    break;

                case 3:
                    cardType = "ARMOUR";
                    statType = "DEF";
                    break;

                case 4:
                    cardType = "ABILITY";
                    statType = "USE";
                    break;

                case 5:
                    return -1;

            }
            if(catAns == 5){
                break;
            }

            clearScreen();

            //displays menu at top
            System.out.println("Select one of the following cards to use in your " + cardType + " slot(s)"
                    + "\n[To go back to category selection enter '0']"
                    + "\n\nYOUR " + cardType + " CARDS: ");


            //adds the correct type of cards into the typeCardArray
            for (int i = 0; i < playerHand.size(); i++) {
                if (playerHand.get(i).type.equals(cardType))
                    typeCardArray.add(playerHand.get(i));

            }

            //Displays Name (Rank) [stat]
            for (int i = 0; i < typeCardArray.size(); i++) {
                if (typeCardArray.get(i).type.equalsIgnoreCase("ABILITY")) {
                    System.out.println((i + 1) + ". " + typeCardArray.get(i).name + " (" + convNumtoRoman(typeCardArray.get(i).rank) + ") [" + typeCardArray.get(i).stat + " " + statType + "] " + "Description: " + typeCardArray.get(i).description);
                }
                else{
                    System.out.println((i + 1) + ". " + typeCardArray.get(i).name + " (" + convNumtoRoman(typeCardArray.get(i).rank) + ") [" + typeCardArray.get(i).stat + " " + statType + "]");
                }

            }
            //Error handling
            while (true){
                //Gets the card you want to select
                selectCard = scanN.nextInt();
                if (selectCard < 0)
                    System.out.println("ERROR: Enter a non negative integer");

                else if (selectCard > typeCardArray.size())
                    System.out.println("ERROR: Your input is out of range");

                else
                    break;
            }


            if(selectCard > 0){ // 0 is the input required to return back to the menu so this ensures that further actions will be done
                selectCard -= 1;
                System.out.println("HERE ARE YOUR CURRENT SLOTS:");
                displaySlots(playerSlots); // displays current slots
                System.out.println("Which " + cardType + " slot would you like to build?");

                while (true) {
                    buildChoice = scanN.nextInt() - 1; // this will find the index of the card slot you want to upgrade

                    //ERROR HANDLING
                    if (buildChoice < 0 || buildChoice > 4)
                        System.out.println("ERROR: INPUT VALID RANGE");

                    else if(!cardType.equals(playerSlots[buildChoice].type))
                        System.out.println("ERROR: INCOMPATIBLE CARD TYPE");

                    else if (typeCardArray.get(selectCard).rank < playerSlots[buildChoice].rank)
                        System.out.println("ERROR: You cannot build a lower level card onto a higher level card");

                    else if ((typeCardArray.get(selectCard).rank - playerSlots[buildChoice].rank) > 1)
                        System.out.println("ERROR: Your selected card is too high level to build onto your desired slot");

                    else {
                        returnMenu = "n"; // makes it so you do not return to the main menu and breaks out the inner while statement
                        break;
                    }

                    //if the break statement is not reach that means there was an error with the user input and they will be asked if they want to go back to menu
                    System.out.print("Would you like to return to your HAND Menu? if not you will be prompted to try again. (Y/N): ");
                    returnMenu = scanS.nextLine();

                    //user conditions to go back to menu
                    if (returnMenu.equalsIgnoreCase("y"))
                        break;

                }
                //Breaks out the outer while statement and completes the upgrade action
                if (returnMenu.equalsIgnoreCase("n")) {
                    break;
                }
            }

        }

        clearScreen();
        System.out.println("BUILDING...");

        playerHand.remove(typeCardArray.get(selectCard));


        playerSlots[buildChoice] = typeCardArray.get(selectCard);
        abilityHandle(typeCardArray.get(selectCard), player);

        System.out.println("\nNEW UPGRADED SLOTS:");
        displaySlots(playerSlots);
        upgradeStats(player, playerSlots, buildChoice);

        System.out.print("PRESS ENTER TO CONTINUE");
        returnMenu = scanS.nextLine();

        return -1;
    }

    public static int buildSlotMenu1() {
        int catAns;

        while (true){
            //Displays menu
            System.out.println("BUILDING MENU:\n\t\tPLAYER HAND:" +
                    "\n1.WEAPON | 2.HELMET | 3.ARMOUR | 4.ABILITY | 5.DO NOT BUILD");

            System.out.println("\nENTER CATEGORY TO ACCESS (NUM): ");
            catAns = scanN.nextInt();

            //Error handling
            if(catAns < 1 || catAns > 5) {
                System.out.println("ERROR: Please enter a valid input\n\n");
                continue;
            }

            break;
        }
        //return the answer of what type of card they want to view
        return catAns;
    }

    public static String convNumtoRoman(int num){
        switch (num){
            case 1:
                return "I";

            case 2:
                return "II";

            case 3:
                return "III";

            default:
                return "IV";
        }
    }

    public static void poisonAbility(Shadow enemy, Shadow player){
        if(player.playerClass.equalsIgnoreCase("Sorcerer") && poison!=0){
            poison--;
            enemy.hp-=5;
            System.out.println(enemy.name + " has lost 5 health to " + RED + "Poison" +RESET);
        }
    }

    public static void everGreenAbility(Shadow player){
        if(everGreen){
            player.hp+=2;
            System.out.println(player.name + " healed 2 due to " + GREEN + "Evergreen" + RESET);
        }
    }

    public static void compOpponent(int turn, Card[] compSlots, Shadow player, Shadow comp, ArrayList <Card> compHand){
        if(comp.playerClass.equalsIgnoreCase("Sorcerer")){
           if(forceField){
               forceField=false;
           }
           poisonAbility(player, comp);
           everGreenAbility(comp);
        }
        boolean build = true;
        System.out.println("----------------------------------------------------------");
        displaySlots(compSlots);
        displaySlots(playerSlots);

        //ATTACK OR DRAW
        if(turn<5){
            drawCard(compHand, compDeck);
            System.out.println("Your Opponent drew a card.");
        }
        else{
            if(compDeck.isEmpty()){
                if(forceField==false){
                    System.out.println(RED + "The opponent dealt " + attack(comp, player) + " damage to you!" + RESET);
                }
            }
            else{
                int[] possibilities = {1, 3, 2, 4, 6, 7, 8, 9, 11};
                int choiceChance = possibilities[random.nextInt(1, 8)];
                if(choiceChance%2 == 0 && forceField==false){
                    System.out.println(RED + "The opponent dealt " + attack(comp, player) + " damage to you!" + RESET);
                }
                else{
                    drawCard(compHand, compDeck);
                    System.out.println("Your Opponent drew a card.");
                }
            }

        }

        if(trueAim && comp.playerClass.equalsIgnoreCase("Sorcerer")){
            trueAim = false;
        }

        // BUILDING
        //ABILITIES
        for(int i = 0; i<compHand.size(); i++){
            if(compHand.get(i).type.equalsIgnoreCase("Ability")){
                abilityHandle((AbilityCard) compHand.get(i), comp);
                compSlots[4] = compHand.get(i);
                build = false;
                compHand.remove(i);
                upgradeStats(comp, compSlots, 4);
                break;
            }
        }

        //WEAPONS
        if(player.atkDamage > comp.atkDamage && build){
            //Upgrade Weapon;
            for(int i = 0; i<compHand.size(); i++){
                if(compHand.get(i).type.equalsIgnoreCase("Weapon")){
                    if(compHand.get(i).rank-compSlots[0].rank == 1){
                        Card old = compSlots[0];
                        compSlots[0] = compHand.get(i);
                        build = false;
                        upgradeStats(comp, compSlots, 0);
                        System.out.println("The opponent upgraded their " + old.name + " to a " + compSlots[0].name + "!");
                        break;
                    }
                    else if(compHand.get(i).rank-compSlots[1].rank == 1){
                        Card old = compSlots[1];
                        compSlots[1] = compHand.get(i);
                        build = false;
                        upgradeStats(comp, compSlots, 1);
                        System.out.println("The opponent upgraded their " + old.name + " to a " + compSlots[1].name + "!");
                        break;
                    }
                }
            }
        }
        //ARMOUR AND HELMS
        if(player.defense > comp.defense && build){
            //Upgrade Defense
            for(int i = 0; i<compHand.size(); i++){
                if(compHand.get(i).type.equalsIgnoreCase("Helmet")){
                    if(compHand.get(i).rank-compSlots[2].rank == 1){
                        //int slotNum = 2;
                        Card old = compSlots[2];
                        compSlots[2] = compHand.get(i);
                        build = false;
                        upgradeStats(comp, compSlots, 2);
                        System.out.println("The opponent upgraded their " + old.name + " to a " + compSlots[2].name + "!");
                        break;
                    }
                if(compHand.get(i).type.equalsIgnoreCase("Armour")){
                    if(compHand.get(i).rank-compSlots[3].rank == 1){
                        Card old = compSlots[3];
                        compSlots[3] = compHand.get(i);
                        build = false;
                        upgradeStats(comp, compSlots, 3);
                        System.out.println("The opponent upgraded their " + old.name + " to a " + compSlots[3].name + "!");
                        break;
                    }
                }

                }
            }
        }

        if(build){
            System.out.println("Your Opponent did not build this turn.\n-----------------------------------------------");
        }

        //displayStats(comp);
        //displayStats(player);

        while(true){
            System.out.println("Press ENTER to continue");
            if(scanS.nextLine().isBlank())
                break;

            else
                System.out.println("Incorrect Input. Try Again.");
        }

    }

    public static void winMessage(Shadow player){
        if(player.hp>0){
            clearScreen();
            System.out.println(GREEN + "YOU WON!!\n-----------------------------------------------------------" + RESET);
            if(player.playerClass.equalsIgnoreCase("berserker")){
                System.out.println(RED + "  ,  /\\  .  \n" +
                        " //`-||-'\\\\ \n" +
                        "(| -=||=- |)\n" +
                        " \\\\,-||-.// \n" +
                        "  `  ||  '  \n" +
                        "     ||     \n" +
                        "     ||     \n" +
                        "     ||     \n" +
                        "     ||     \n" +
                        "     ||     \n" +
                        "     ()" + RESET);
            }
            else{
                System.out.println(GREEN + ".---.\n" +
                        "       |---|\n" +
                        "       |---|\n" +
                        "       |---|\n" +
                        "   .---^ - ^---.\n" +
                        "   :___________:\n" +
                        "      |  |//|\n" +
                        "      |  |//|\n" +
                        "      |  |//|\n" +
                        "      |  |//|\n" +
                        "      |  |//|\n" +
                        "      |  |//|\n" +
                        "      |  |.-|\n" +
                        "      |.-'**|\n" +
                        "       \\***/\n" +
                        "        \\*/\n" +
                        "         V\n" +
                        "\n" +
                        "        '\n" +
                        "         ^'\n" +
                        "        (_)" + RESET);
            }
        }
        else {
            System.out.println("__   _______ _   _   _     _____ _____ _____ _ \n" +
                    "\\ \\ / /  _  | | | | | |   |  _  /  ___|  ___| |\n" +
                    " \\ V /| | | | | | | | |   | | | \\ `--.| |__ | |\n" +
                    "  \\ / | | | | | | | | |   | | | |`--. \\  __|| |\n" +
                    "  | | \\ \\_/ / |_| | | |___\\ \\_/ /\\__/ / |___|_|\n" +
                    "  \\_/  \\___/ \\___/  \\_____/\\___/\\____/\\____/(_)");
            System.out.println();
            System.out.println(RED + "▓██   ██▓ ▒█████   █    ██     ██▓     ▒█████    ██████ ▓█████  ▐██▌\n" +
                    " ▒██  ██▒▒██▒  ██▒ ██  ▓██▒   ▓██▒    ▒██▒  ██▒▒██    ▒ ▓█   ▀  ▐██▌\n" +
                    "  ▒██ ██░▒██░  ██▒▓██  ▒██░   ▒██░    ▒██░  ██▒░ ▓██▄   ▒███    ▐██▌\n" +
                    "  ░ ▐██▓░▒██   ██░▓▓█  ░██░   ▒██░    ▒██   ██░  ▒   ██▒▒▓█  ▄  ▓██▒\n" +
                    "  ░ ██▒▓░░ ████▓▒░▒▒█████▓    ░██████▒░ ████▓▒░▒██████▒▒░▒████▒ ▒▄▄ \n" +
                    "   ██▒▒▒ ░ ▒░▒░▒░ ░▒▓▒ ▒ ▒    ░ ▒░▓  ░░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░░░ ▒░ ░ ░▀▀▒\n" +
                    " ▓██ ░▒░   ░ ▒ ▒░ ░░▒░ ░ ░    ░ ░ ▒  ░  ░ ▒ ▒░ ░ ░▒  ░ ░ ░ ░  ░ ░  ░\n" +
                    " ▒ ▒ ░░  ░ ░ ░ ▒   ░░░ ░ ░      ░ ░   ░ ░ ░ ▒  ░  ░  ░     ░       ░\n" +
                    " ░ ░         ░ ░     ░            ░  ░    ░ ░        ░     ░  ░ ░   \n" +
                    " ░ ░  " + RESET);
        }

    }

    public static int setAbilityHandler(){
        int i = 0;
        for(i = 0; i<abilityHandler.length; i++){
            if(abilityHandler[i] == 0){
                break;
            }
        }
        return i;
    }

    public static void abilityHandle(Card abilityCard, Shadow user){
        switch (abilityCard.name){
            case "Rage":
                if(user.name.equalsIgnoreCase("Opponent")) {
                    cBaseDamage += 2;
                    cBaseDefense++;
                }
                else{
                    pBaseDamage+=2;
                    pBaseDefense++;
                }
                System.out.println(user.name + " increased their damage by 2 and increased their defense by 1 by using " + abilityCard.name);
                abilityCard.stat-=1;
                break;

            case "Rest":
                if(user.hp<=44){
                    user.hp+=6;
                    System.out.println(user.name + " healed 6 by using " + abilityCard.name);
                } else if (user.hp>44) {
                    user.hp = 50;
                    System.out.println(user.name + " healed"+ (50- user.hp) +"by using " + abilityCard.name);
                }
                abilityCard.stat-=1;
                break;

            case "TrueAim":
                abilityCard.stat-=1;
                trueAim = true;
                //abilityHandler[0] =
                //Add Ability Handler
                break;

            case "Fire Token":
                if(user.name.equalsIgnoreCase("Opponent")) {
                    cBaseDamage += 1;
                }
                else{
                    pBaseDamage+=1;
                }
                System.out.println(user.name + " increased their damage by 1 by using a " + abilityCard.name);
                abilityCard.stat-=1;
                break;

            case "Evergreen":
                everGreen=true;
                System.out.println(GREEN + "You will regenerate 2 health each turn" + RESET);
                break;

            case "Poison":
                //abilityCard.stat-=1;
                poison = 2;
                break;

            case "Barrier":
                forceField = true;
                System.out.println(GREEN+"Enemy attack will be blocked next turn."+RESET);
                abilityCard.stat-=1;
                break;
        }
    }

    /*public static String abilityDescription(String name, ArrayList<Card> playerHand){
        for(int i = 0; i<playerHand.size(); i++){
           // if(playerHand.get(i).)
        }
    }*/


}