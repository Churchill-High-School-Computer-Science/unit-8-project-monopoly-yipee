import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class Monopoly {

    static Random r = new Random();
    static Board b = new Board();

    static double rollDice()
    {
        int roll1 = 0;
        while(roll1 == 0)
        {
            roll1 = r.nextInt(7);
        }
        int roll2 = 0;
        while(roll2 == 0)
        {
            roll2 = r.nextInt(7);
        }
        double roll = roll1 + roll2;
        if(roll1 == roll2)
        {
            roll += .1;
        }
        return 2;
    }

    static void mortgage(Player play, int c)
    {
        String[] ch = new String[]{"yes", "no"};
        int choose;
        boolean f = false;
        String prop;
        if(c == 1)
        {
            prop = JOptionPane.showInputDialog("Which property do you want to Unmortgage?");
            for(int x = 0; x < play.getMortgages().size(); x++)
            {
                if(play.getMortgages().get(x).getName().equals(prop))
                {
                    if(play.getMoney() > play.getMortgages().get(x).getMortgageValue())
                    {
                        f = true;
                        choose = Display.choice("Do you want to unmortgage " + prop, "You will pay $" + play.getMortgages().get(x).getMortgageValue(), ch);
                        if(choose == 0)
                        {
                            play.changeMoney(-1 * play.getMortgages().get(x).getMortgageValue());
                            play.getProperties().add(play.getMortgages().get(x));
                            play.getProperties().remove(x);
                        }
                    }
                    else
                    {
                        Display.inform("Sorry man, you're too poor.");
                    }
                }
            }
        }
        else
        {
            prop = JOptionPane.showInputDialog("Which property do you want to mortgage?");
            for(int x = 0; x < play.getProperties().size(); x++)
            {
                if(play.getProperties().get(x).getName().equals(prop))
                {
                    f = true;
                    choose = Display.choice("Do you want to mortgage " + prop, "You will get $" + (play.getProperties().get(x)).getMortgageValue(), ch);
                    if(choose == 0)
                    {
                        play.changeMoney((play.getProperties().get(x)).getMortgageValue());
                        play.getMortgages().add(play.getProperties().get(x));
                        play.getProperties().remove(x);
                    }
                }
            }
        }
        if(f == false)
        {
            Display.inform("No property with that name was found.");
        }
    }

    static void landedProperty(Player play, Property prop)
    {
        int cost = prop.getCost();
        if(play.getMoney() > cost)
        {
            play.changeMoney(-1*cost);
            prop.changePOwner(play);
            prop.changeOwner(play.getName());
            play.getProperties().add(prop);
            Display.inform("Property bought");
        }
        else{
            Display.inform("You broke as heck. Go get the disk from Alamont first. Try not to die.");
        }
        Display.boardPanel.repaint();
    }

    static void payRent(Player play, Property prop)
    {
        int rent = prop.getRent();
        Player landlord = prop.getPOwner();
        Display.inform("You landed on " + landlord.getName() + "'s property");
        if(play.getMoney() > rent)
        {
            play.changeMoney(-1*rent);
            landlord.changeMoney(rent);
        }
        else
        {
            //bankruptcy
        }
    }

    static void incomeTax(Player play)
    {
        String[] c = new String[]{"$200", "20%"};
        int choose = Display.choice("Do you want to pay $200 or 20%", "", c);
        if(choose == 0)
        {
            play.changeMoney(-200);
        }
        else
        {
            play.changeMoney(-1 * (play.getMoney() / 5));
        }
    }

    static void changePropName(Player play)
    {
        boolean f = false;
        String prop = JOptionPane.showInputDialog("Which property do you want to rename?");
        for(int x = 0; x < play.getProperties().size(); x++)
        {
            if(play.getProperties().get(x).getName().equals(prop))
            {
                f = true;
                String choice = JOptionPane.showInputDialog("What do you want to name the property?");
                for(int y = 0; y < play.getProperties().size(); y++)
                {
                    if(play.getProperties().get(y).getName().equals(choice))
                    {
                        Display.inform("That name is already in use.");
                        break;
                    }
                    else
                    {
                        play.getProperties().get(x).changeName(choice);
                        Display.boardPanel.repaint();
                    }
                }
            }
        }
        if(f == false)
        {
            Display.inform("No property with that name was found to be owned by you.");
        }
    }

    static void doChance(Player play, ArrayList<Player> ps)
    {
        int counter = 0;
        int draw = r.nextInt(13);
        int f = 0;
        Cards c = b.chanceCards[draw];
        Display.inform(c.getText());
        if(c.getType() == 1)
        {
            if(c.getText().equals("Pay each player $50."))
            {
                for(int x = 0; x < ps.size(); x++)
                {
                    ps.get(x).changeMoney(-1 * c.getMoneyValue());
                    counter++;
                }
                play.changeMoney(counter * c.getMoneyValue());
            }
            else
            {
                play.changeMoney(c.getMoneyValue());
            }
        }
        if(c.getType() == 0)
        {
            if(c.getLocation() > -1)
            {
                play.setLocation(c.getLocation());
            }
            else if(c.getLocation() == -1)
            {
                for(int x = play.getLocation(); x < 39; x++)
                {
                    if(f == 1)
                    {
                        break;
                    }
                    if(Board.propertiesMap.get(x).getName().length() < 8)
                    {
                        continue;
                    }
                    System.out.println(x);
                    for(int y = 0; y < (Board.propertiesMap.get(x).getName()).length()-7; y++)
                    {
                        System.out.println(Board.propertiesMap.get(x).getName().substring(y, y+8));
                        if(Board.propertiesMap.get(x).getName().substring(y, y+8).equals("Railroad"))
                        {
                            if(play.getLocation() + x > 40)
                            {
                            play.changeMoney(200);
                            }
                            play.setLocation(x);
                            f = 1;
                        }
                    }
                }
            }
            if(c.getLocation() == -2)
            {
                for(int x = play.getLocation(); x < 39; x++)
                {
                    if(Board.propertiesMap.get(x).getName().equals("Water works")||Board.propertiesMap.get(x).getName().equals("Electric Company"))
                    {
                        if(play.getLocation() + x > 40)
                        {
                            play.changeMoney(200);
                        }
                        play.setLocation(x);
                    }
                }
            }
            if(c.getLocation() == -3)
            {
                play.changeLocation(-3);
            }
        }
        Display.boardPanel.repaint();
    }

    static void doChest(Player play, ArrayList<Player> ps)
    {
        int counter = 0;
        int draw = r.nextInt(13);
        int f = 0;
        Cards c = b.communityChestCards[draw];
        Display.inform(c.getText());
        if(c.getType() == 1)
        {
            if(c.getText().equals("It is your birthday. Collect $10 from every player."))
            {
                for(int x = 0; x < ps.size(); x++)
                {
                    ps.get(x).changeMoney(-1 * c.getMoneyValue());
                    counter++;
                }
                play.changeMoney(counter * c.getMoneyValue());
            }
            else
            {
                play.changeMoney(c.getMoneyValue());
            }
        }
        if(c.getType() == 0)
        {
            if(c.getLocation() > -1)
            {
                play.setLocation(c.getLocation());
            }
           
        }
        Display.boardPanel.repaint();
    }

    public static void main(String[] args) {
        boolean d = false;
        boolean turnGo = true;
        boolean turnGo2 = true;
        double rolld = 0;
        int round;
        int roll = 0;
        int turn = 0;
        int choose = 1;
        ArrayList<Player> players = new ArrayList<Player>();
        String[] c = new String[]{"yes", "no"};

        String playerNames;
        int playerAmount = Display.choice("How many players are there?", "", new String[] {"1", "2", "3", "4"});
        for(int x = 0; x <= playerAmount; x++)
        {
            playerNames = JOptionPane.showInputDialog("What is the name of player " + ++x + "?");
            x--;
            players.add(new Player(playerNames));
            Display.players.add(players.get(x));
        }
        //Graphics!
        
        SwingUtilities.invokeLater(() -> Display.setupFrame());
        
        while(true)
        {
            turnGo = true;
            if(turn == playerAmount + 1)
            {
                turn = 0;
            }
            while(turnGo)
            {
                //Checking for doubles
                d = false;
                rolld = rollDice();
                roll = (int)rolld;

                if(players.get(turn).getLocation() + roll > 40)
                {
                    players.get(turn).changeMoney(200);
                }
                players.get(turn).changeLocation(roll);
                players.get(turn).passGo();
                Display.boardPanel.repaint();
                
                rolld = Math.round((rolld - roll) * 100);
                rolld /= 100;
                if(rolld == 0.1)
                {
                    d = true;
                }
            
                if(d == false)
                {
                    Display.inform("You rolled " + roll);
                    turnGo = false;
                }
                else
                {
                    Display.inform("You rolled " + roll + ". It was a double.");
                }
                
                Display.inform("You landed on " + Board.propertiesMap.get(players.get(turn).getLocation()).getName());
                
                //JUST BUYABLES
                if(Board.propertiesMap.get(players.get(turn).getLocation()).getType() == 4)
                {
                    if(Board.propertiesMap.get(players.get(turn).getLocation()).getOwner().equals("board"))
                    {
                        choose = Display.choice("Buy property?", "", c);
                        if(choose == 0)
                        {
                            landedProperty(players.get(turn), Board.propertiesMap.get(players.get(turn).getLocation()));
                            
                        }
                    }
                    else
                    {
                        payRent(players.get(turn), Board.propertiesMap.get(players.get(turn).getLocation()));
                    }
                }
                
                //Tax and go
                if(Board.propertiesMap.get(players.get(turn).getLocation()).getName().equals("Income Tax"))
                {
                     incomeTax(players.get(turn));
                }
                if(Board.propertiesMap.get(players.get(turn).getLocation()).getName().equals("Luxery Tax"))
                {
                    Display.inform("You paid $75 for luxury tax.");
                    players.get(turn).changeMoney(-75);
                }
                
                Display.boardPanel.repaint();
                if(Board.propertiesMap.get(players.get(turn).getLocation()).getName().equals("GO"))
                {
                    players.get(turn).changeMoney(200);
                }

                //Chance cards
                if(Board.propertiesMap.get(players.get(turn).getLocation()).getName().equals("Chance"))
                {
                    doChance(players.get(turn), players);
                }
                if(Board.propertiesMap.get(players.get(turn).getLocation()).getName().equals("Community Chest"))
                {
                    doChest(players.get(turn), players);
                }
            }
            round = 0;
            turnGo2 = true;
            while(turnGo2)
            {
                    //Changing property names
                if(players.get(turn).getProperties().size() > 0)
                {
                    choose = Display.choice("Change property name?", "", c);
                    if(choose == 0)
                    {
                        changePropName(players.get(turn));
                    }
                }
                    //Mortgage
                if(players.get(turn).getProperties().size() > 0 || players.get(turn).getMortgages().size() > 0)
                {
                    choose = Display.choice("Do you want to mortgage or unmortgage property?", "", new String[] {"Mortgage", "Unmortgage", "No"});
                    if(choose < 2)
                    {
                        mortgage(players.get(turn), choose);
                    }
                    Display.boardPanel.repaint();
                }
                choose = Display.choice("Do you want to end your turn?", "", c);
                if(choose == 0)
                {
                    turnGo2 = false;
                }
                round++;
                if(round == 3)
                {
                    choose = Display.choice("You know other people are playing right?", "", c);
                    if(choose == 0)
                    {
                        turnGo2 = false;
                    }
                    else
                    {
                        players.get(turn).changeMoney(-1 * players.get(turn).getMoney());
                        Display.boardPanel.repaint();
                        turnGo2 = false;
                    }
                }
            
            }
            turn++;
        }
        
    }
}
