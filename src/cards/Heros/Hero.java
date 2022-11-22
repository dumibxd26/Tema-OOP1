package cards.Heros;

import cards.CardWithHealth;
import cards.Minion;

import java.util.ArrayList;

/**
 * Hero abstract class which extends CardWithHealth class
 * it only has an abstract function to implement: useAbility
 */
public abstract class Hero extends CardWithHealth {

    private Boolean attackedThisTurn = false;

    public Hero(int mana, String description, ArrayList<String> colors, String name, int health) {
        super(mana, description, colors, name, health);
    }

    public Boolean getAttackedThisTurn() {
        return attackedThisTurn;
    }

    public void setAttackedThisTurn(Boolean attackedThisTurn) {
        this.attackedThisTurn = attackedThisTurn;
    }

    public abstract void useAbility(ArrayList<ArrayList<Minion>> playMatrix, int row);

    @Override
    public String toString() {
        return "{" +
                "mana" + this.getMana() +
                ", description'" + this.getDescription() + '\'' +
                ", colors" + this.getColors() +
                ", name'" + this.getName()+ '\'' +
                ", health" + health +
                '}';
    }
}
