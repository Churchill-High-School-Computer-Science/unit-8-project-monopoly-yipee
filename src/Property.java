
import java.awt.Color;

public class Property {

    private Player pOwner;
    private String owner;
    private String name;
    private Color color;
    private int cost;
    private int rent;
    private int type;
    private int mortgageValue;
    private int houses;
    private int houseCost;
    
    public Property(String name, String owner, int type, int cost, int rent, int mortgageValue, int houseCost, Color color){
        this.name = name;
        this.owner = owner;
        this.type = type;
        this.cost = cost;
        this.rent = rent;
        this.mortgageValue = mortgageValue;
        this.houseCost = houseCost;
        this.color = color;
    }

    public Property(String name, String owner, int type, int cost, int rent, int mortgageValue, Color color){
        this.name = name;
        this.owner = owner;
        this.type = type;
        this.cost = cost;
        this.rent = rent;
        this.mortgageValue = mortgageValue;
        this.color = color;
    }

    public Property(String name, int type, Color color){
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public Property(String name, int type, int rent, Color color){
        this.name = name;
        this.type = type;
        this.rent = rent;
        this.color = color;
    }

    public Player getPOwner(){
        return pOwner;
    }

    public void changePOwner(Player play){
        pOwner = play;
    }
    
    public String getOwner(){
        return owner;
    }

    public void changeOwner(String player){
        owner = player;
    }

    public String getName(){
        return name;
    }

    public void changeName(String n){
        name = n;
    }

    public Color getColor(){
        return color;
    }

    public int getCost(){
        return cost;
    }

    public int getRent(){
        return rent;
    }

    public int getType(){
        return type;
    }

    public int getMortgageValue(){
        return mortgageValue;
    }

    public int getHouseCost(){
        return houseCost;
    }

    public int getNumHouses(){
        return houses;
    }
}
