/**
 * Programmer: Maanvik
 * Description: Blueprint for all Helm cards
 */
public class Helm {
    String name;
    String rank;
    int defense;
    boolean active;

    public void init(String helmName, int helmDefense, String helmRank, boolean inGame) {
        name = helmName;
        rank = helmRank;
        defense = helmDefense;
        active = inGame;
    }
}
