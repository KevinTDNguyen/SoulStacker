public class WeaponCard extends Card {
    int damage;

    public WeaponCard(String name, int rank, String gameClass ,int stat, String type){
        super(name, rank, gameClass ,stat, type);
        this.damage = this.stat;
    }

}
