public class Rage extends AbilityCard{
    public Rage(String name, int rank, int stat,String type){
        super(name, rank, stat ,type);
    }
    @Override
    public void ability(Shadow berserk, boolean active){
        berserk.atkDamage+=2;
        berserk.defense+=1;
        System.out.println(berserk.name + " increased attack by 2 and defense by 1!");
    }
}
