public class WeaponCard extends Card {
    int damage;

    public WeaponCard(String name, int rank, int stat){
        super(name, rank, stat);
        this.damage = this.stat;
    }

}
