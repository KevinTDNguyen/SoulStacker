/**
 * Programmer: Maanvik
 * Description: Blueprint for all Weapon cards
 */
public class Weapon {
    String name;
    String rank;
    int damage;
    boolean active;

    public void init(String weaponName, int AtkDamage, String weaponRank, boolean inGame) {
        name = weaponName;
        rank = weaponRank;
        damage = AtkDamage;
        active = inGame;
        }
    }
