public class ArmourCard extends Card{ // extends will allow us to use the methods created in the Card class
    int defense;

    public ArmourCard(String name, int rank, int stat){
        super(name, rank, stat); // super basically inherits the constructor variables of the Card class all in one go (which reduces clutter)
        this.defense = this.stat; //renames the 'stat' variable from the Card class to something more relevant to the ArmourCard class.
    }
}
