
import java.util.ArrayList;

public class Player {

    private String name;
    private int money;
    public ArrayList<Property> playerProps = new ArrayList<Property>();
    private int Location;

    public Player(String name){
        this.name = name;
        money = 1500;
        Location = 0;
    }
    //TODO FIX
    public String getName(){
        return name;
    }

    ///TODO FIX
    public int getMoney(){
        return money;
    }

    //TODO FIX
    public ArrayList<Property> getProperties(){
        return playerProps;
    }

    //TODO FIX
    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return Location;
    }
}
