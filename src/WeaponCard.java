public class WeaponCard extends Card {
    int damage;

    public WeaponCard(String name, int rank, int stat, String type, String description){
        super(name, rank, stat, type, description);
        this.damage = this.stat;
    }

}
