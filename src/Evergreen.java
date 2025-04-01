public class Evergreen extends AbilityCard{
    public Evergreen(String name, int rank, int stat,String type){
        super(name, rank, stat ,type);
    }
    @Override
    public void ability(Shadow user, boolean active){
        user.hp+=2;
        System.out.println(user.name + " regenerated 2 health.");
    }
}
