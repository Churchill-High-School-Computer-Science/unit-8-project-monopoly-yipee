
import java.awt.Color;

public class Property {

    public String name;
    public String owner;
    public int cost;
    public int rent;
    private int mortgageValue;
    private int houses;
    public int houseCost;
    private Color color;
    
    public Property(String name, String owner, int cost, int rent, int mortgageValue, int houseCost, Color color){
        this.name = name;
        this.owner = owner;
        this.cost = cost;
        this.rent = rent;
        this.mortgageValue = mortgageValue;
        this.houseCost = houseCost;
        this.color = color;
    }

    public Property(String name, String owner, int cost, int rent, int mortgageValue, Color color){
        this.name = name;
        this.owner = owner;
        this.cost = cost;
        this.rent = rent;
        this.mortgageValue = mortgageValue;
        this.color = color;
    }

    public Property(String name, Color color){
        this.name = name;
        this.color = color;
    }

    public Property(String name, int rent, Color color){
        this.name = name;
        this.rent = rent;
        this.color = color;
    }
    //TODO fix
    public Color getColor(){
        return color;
    }

    //TODO fix
    public String getName(){
        return name;
    }

    //TODO fix
    public int getNumHouses(){
        return houses;
    }

    //TODO fix
    public String getOwner(){
        return owner;
    }

    //TODO fix
    public int getRent(){
        return rent;
    }
}
