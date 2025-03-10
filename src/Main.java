import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Shadow player = new Shadow("Kevin", 100, 25, "sorcerer");
        Shadow comp = new Shadow("Skeilgodr", 100, 25, "berserker");

        //examples of how to setup different objects using the classes i modified/created - kevin
        WeaponCard dagger = new WeaponCard("Dagger", 1, 5, "Weapon");
        HelmCard greatHelm = new HelmCard("Great Helm", 3, 6, "Helmet");
        System.out.println(dagger.visual[0]);
        System.out.println(dagger.visual[1]);
        System.out.println(dagger.visual[2]);
        System.out.println(dagger.visual[3]);
        System.out.println(dagger.visual[4]);
        System.out.println(dagger.visual[5]);
        System.out.println(dagger.visual[6]);
        //introMenu(player);

        //Examples of how this works, be free to delete once concepts are understood
        System.out.println("Weapon Name: " + dagger.name);
        System.out.println("Rank: " + dagger.rank);
        System.out.println("Damage " + dagger.damage);



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


}

