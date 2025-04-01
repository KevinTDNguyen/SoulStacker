public class Rest extends AbilityCard{
    public Rest(String name, int rank, int stat,String type){
        super(name, rank, stat ,type);
    }
    @Override
    public void ability(Shadow user, boolean active){
        user.hp+=6;
        System.out.println(user.name + " healed 6.");
    }
}
