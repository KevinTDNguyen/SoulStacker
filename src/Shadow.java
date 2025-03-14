public class Shadow {

    String name, playerClass;
    int hp, atkDamage, defense;

    public Shadow(String name, int hp, int atkDamage, int defense, String playerClass){
        this.name = name;
        this.hp = hp;
        this.defense = defense;
        this.atkDamage = atkDamage;
        this.playerClass = playerClass;
    }

    public void takeDamage(Shadow attacker){
        int damageDealt;
        damageDealt = attacker.atkDamage - this.defense;
        if (damageDealt < 0)
            damageDealt = 1;

        this.hp = damageDealt;
        System.out.println(attacker.name + " did [" + damageDealt + "] dmg to " + this.name);
    }

}
