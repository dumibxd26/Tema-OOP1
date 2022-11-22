package cards;

import fileio.Coordinates;

import java.util.ArrayList;
import java.util.Map;

/**
 * Environment card which only has useAbility function to be implemented
 */
public abstract class Environment extends Card{

    public Environment(int mana, String description, ArrayList<String> colors, String name) {
        super(mana, description, colors, name);
    }

    public abstract void useAbility(ArrayList<ArrayList<Minion>> playMatrix, int row);

    @Override
    public String toString() {
        return "{" +
                "mana=" + this.getMana() +
                ", description='" + this.getDescription() + '\'' +
                ", colors=" + this.getColors() +
                ", name='" + this.getName() + '\'' +
                '}';
    }
}
