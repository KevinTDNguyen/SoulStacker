/**
 * Programmer: Maanvik
 * Description: Blueprint for all Armor cards
 */
public class Armor {
    String name;
    String rank;
    int defense;
    boolean active;

    public void init(String armorName, int armorDefense, String armorRank, boolean inGame) {
        name = armorName;
        rank = armorRank;
        defense = armorDefense;
        active = inGame;
    }
}
