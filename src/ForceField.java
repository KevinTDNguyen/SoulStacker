public class ForceField extends AbilityCard{
    public ForceField(String name, int rank, int stat,String type){
        super(name, rank, stat ,type);
    }
    @Override
    public void ability(Shadow user, boolean activate){
        activate = true;
        System.out.println(RED + user.name + " used a force field! They are invulnerable next turn!" + RESET);
    }
}
