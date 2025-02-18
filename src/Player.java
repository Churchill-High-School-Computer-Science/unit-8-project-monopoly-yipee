
import java.util.ArrayList;

public class Player {

    private String name;
    private int money;
    private ArrayList<Property> playerProps = new ArrayList<>();
    private ArrayList<Property> mortgagedProps = new ArrayList<>();
    private int Location;
    private int getOutJail;

    public Player(String name){
        this.name = name;
        money = 1500;
        Location = 0;
    }

    public void changeMoney(int m)
    {
        money += m;
    }

    public String getName(){
        return name;
    }

    public int getMoney(){
        return money;
    }

    public ArrayList<Property> getProperties(){
        return playerProps;
    }

    public ArrayList<Property> getMortgages(){
        return mortgagedProps;
    }

    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return Location;
    }

    void changeLocation(int l){
        Location += l;
    }

    void setLocation(int l){
        Location = l;
    }

    void gotGetOutJail()
    {
        getOutJail++;
    }

    public int getGetOutJail()
    {
        return getOutJail;
    }

    void passGo(){
        Location %= 40;
    }
}
