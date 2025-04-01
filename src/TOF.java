public class TOF extends AbilityCard{
    public TOF(String name, int rank, int stat,String type){
        super(name, rank, stat ,type);
    }
    @Override
    public void ability(Shadow berserk, boolean active){
        berserk.atkDamage+=1;
        active = true;
        System.out.println(berserk.name + " increased attack by 1!");
    }
}
