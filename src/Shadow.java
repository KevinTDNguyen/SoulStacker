public class Shadow {

    String name, playerClass;
    int hp, atkDamage;

    public Shadow(String name, int hp, int atkDamage, String playerClass){
        this.name = name;
        this.hp = hp;
        this.atkDamage = atkDamage;
        this.playerClass = playerClass;
    }

    public void takeDamage(Shadow attacker){
        this.hp -= attacker.atkDamage;
        System.out.println(attacker.name + " did [" + attacker.atkDamage + "] dmg to " + this.name);
    }

}
