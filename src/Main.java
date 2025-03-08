
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("This is a change made by Maanvik Arora. I did not create a separate branch for this test.");
        System.out.println("Good job maanvik");

        // Testing Area. Feel Free to Delete. - Maanvik
        Weapon dagger = new Weapon();
        dagger.init("Dagger", 5, "A", true);
        System.out.println(dagger.damage);
        Helm greatHelm = new Helm();
        greatHelm.init("Great Helm", 6, "A", false);
        System.out.println(greatHelm.rank);
        Armor berserkerArmor = new Armor();
        berserkerArmor.init("Berserker Armor", 10, "S", false);
        System.out.println(berserkerArmor.defense);
    }
}