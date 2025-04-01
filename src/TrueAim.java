public class TrueAim extends AbilityCard{
    public TrueAim(String name, int rank, int stat,String type){
        super(name, rank, stat ,type);
    }
    @Override
    public void ability(Shadow user, boolean trueAim){
        trueAim = true;

        System.out.println("Maanvik ");
    }
}
