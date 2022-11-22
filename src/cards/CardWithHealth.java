package cards;

import java.util.ArrayList;

/**
 * Abstract class which adds the health property to a class
 * used for Minions and Heroes
 */
public abstract class CardWithHealth extends Card{

    public int health;

    public CardWithHealth(int mana, String description, ArrayList<String> colors, String name,int health) {
        super(mana, description, colors, name);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
