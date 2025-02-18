
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;


public class Board {
    public Property[][] propers = new Property[11][11];
    static Map<Integer, Property> propertiesMap = new HashMap<>();

    public Cards[] chanceCards = new Cards[16];
    public Cards[] communityChestCards = new Cards[16];
    
    public Board()
    {
        Display.properties = propers;
        propers[0][0] = new Property("GO", "board", 1, 0, 0, 0, new Color(0, 255, 0));
        propertiesMap.put(0, propers[0][0]);
        propers[1][0] = new Property("Mediterranean Avenue", "board", 4, 60, 2, 30, 50, new Color(102, 51, 0));
        propertiesMap.put(1, propers[1][0]);
        propers[2][0] = new Property("Community Chest", 2, new Color(0, 255, 0));
        propertiesMap.put(2, propers[2][0]);
        propers[3][0] = new Property("Baltic Avenue", "board", 4, 60, 4, 30, 50, new Color(102, 51, 0));
        propertiesMap.put(3, propers[3][0]);
        propers[4][0] = new Property("Income Tax", 3, 200, new Color(0, 255, 0));
        propertiesMap.put(4, propers[4][0]);
        propers[5][0] = new Property("Reading Railroad", "board", 4, 200, 25, 100, new Color(0, 0, 0));
        propertiesMap.put(5, propers[5][0]);
        propers[6][0] = new Property("Oriental Avenue", "board", 4, 100, 6, 50, 50, new Color(0, 153, 204));
        propertiesMap.put(6, propers[6][0]);
        propers[7][0] = new Property("Chance", 2, new Color(0, 255, 0));
        propertiesMap.put(7, propers[7][0]);
        propers[8][0] = new Property("Vermont Avenue", "board", 4, 100, 6, 60, 50, new Color(0, 153, 204));
        propertiesMap.put(8, propers[8][0]);
        propers[9][0] = new Property("Connecticut Avenue", "board", 4, 120, 8, 60, 50, new Color(0, 153, 204));
        propertiesMap.put(9, propers[9][0]);
        propers[10][0] = new Property("Jail", 1, new Color(60, 60, 60));
        propertiesMap.put(10, propers[10][0]);
        propers[10][1] = new Property("St. Charles Place", "board", 4, 140, 10, 70, 100, new Color(204, 68, 204));
        propertiesMap.put(11, propers[10][1]);
        propers[10][2] = new Property("Electric Company", "board", 4, 150, 0, 75, new Color(0, 2, 0));
        propertiesMap.put(12, propers[10][2]);
        propers[10][3] = new Property("States Avenue", "board", 4, 140, 10, 70, 100, new Color(204, 68, 204));
        propertiesMap.put(13, propers[10][3]);
        propers[10][4] = new Property("Virgina Avenue", "board", 4, 160, 12, 80, 100, new Color(204, 68, 204));
        propertiesMap.put(14, propers[10][4]);
        propers[10][5] = new Property("Pennsylvania Railroad", "board", 4, 200, 25, 100, new Color(0, 0, 0));
        propertiesMap.put(15, propers[10][5]);
        propers[10][6] = new Property("St. James Place", "board", 4, 180, 14, 80, 100, new Color(194, 88, 30));
        propertiesMap.put(16, propers[10][6]);
        propers[10][7] = new Property("Community Chest", 2, new Color(0, 255, 0));
        propertiesMap.put(17, propers[10][7]);
        propers[10][8] = new Property("Tennessee Avenue", "board", 4, 180, 14, 90, 100, new Color(194, 88, 30));
        propertiesMap.put(18, propers[10][8]);
        propers[10][9] = new Property("New York Avenue", "board", 4, 200, 16, 90, 100, new Color(194, 88, 30));
        propertiesMap.put(19, propers[10][9]);
        propers[10][10] = new Property("Free Parking", 1, new Color(255, 255, 255));
        propertiesMap.put(20, propers[10][10]);
        propers[9][10] = new Property("Kentucky Avenue", "board", 4, 220, 18, 110, 150, new Color(255, 0, 0));
        propertiesMap.put(21, propers[9][10]);
        propers[8][10] = new Property("Chance", 2, new Color(0, 255, 0));
        propertiesMap.put(22, propers[8][10]);
        propers[7][10] = new Property("Indiana Avenue", "board", 4, 220, 18, 110, 150, new Color(255, 0, 0));
        propertiesMap.put(23, propers[7][10]);
        propers[6][10] = new Property("Illinois Avenue", "board", 4, 240, 20, 120, 150, new Color(255, 0, 0));
        propertiesMap.put(24, propers[6][10]);
        propers[5][10] = new Property("B&O Railroad", "board", 4, 200, 25, 100, new Color(0, 0, 0));
        propertiesMap.put(25, propers[5][10]);
        propers[4][10] = new Property("Atlantic Avenue", "board", 4, 260, 22, 130, 150, new Color(255, 255, 51));
        propertiesMap.put(26, propers[4][10]);
        propers[3][10] = new Property("Ventnor Avenue", "board", 4, 260, 22, 130, 150, new Color(255, 255, 51));
        propertiesMap.put(27, propers[3][10]);
        propers[2][10] = new Property("Water Works", "board", 4, 150, 0, 75, new Color(0, 2, 0));
        propertiesMap.put(28, propers[2][10]);
        propers[1][10] = new Property("Marvin Gardens", "board", 4, 280, 24, 140, 150, new Color(255, 255, 51));
        propertiesMap.put(29, propers[1][10]);
        propers[0][10] = new Property("Go to Jail", 1, new Color(60, 60, 60));
        propertiesMap.put(30, propers[0][10]);
        propers[0][9] = new Property("Pacific Avenue", "board", 4, 300, 26, 150, 200, new Color(51, 153, 51));
        propertiesMap.put(31, propers[0][9]);
        propers[0][8] = new Property("North Carolina Avenue", "board", 4, 300, 26, 150, 200, new Color(51, 153, 51));
        propertiesMap.put(32, propers[0][8]);
        propers[0][7] = new Property("Community Chest", 2, new Color(0, 255, 0));
        propertiesMap.put(33, propers[0][7]);
        propers[0][6] = new Property("Pennsylvania Avenue", "board", 4, 320, 28, 160, 200, new Color(51, 153, 51));
        propertiesMap.put(34, propers[0][6]);
        propers[0][5] = new Property("Short Line Railroad", "board", 4, 200, 25, 100, new Color(0, 0, 0));
        propertiesMap.put(35, propers[0][5]);
        propers[0][4] = new Property("Chance", 2, new Color(0, 255, 0));
        propertiesMap.put(36, propers[0][4]);
        propers[0][3] = new Property("Park Place", "board", 4, 350, 35, 175, 200, new Color(0, 21, 183));
        propertiesMap.put(37, propers[0][3]);
        propers[0][2] = new Property("Luxury Tax", 2, 75, new Color(0, 255, 0));
        propertiesMap.put(38, propers[0][2]);
        propers[0][1] = new Property("Boardwalk", "board", 4, 400, 50, 200, 200, new Color(0, 21, 183));
        propertiesMap.put(39, propers[0][1]);

        chanceCards[0] = new Cards(0, "Advance to Boardwalk.", 39);
        chanceCards[1] = new Cards(0, "Advance to Go (Collect $200).", 0);
        chanceCards[2] = new Cards(0, "Advance to Illinois Avenue.", 24);
        chanceCards[3] = new Cards(0, "Advance to St. Charles Place.", 11);
        chanceCards[4] = new Cards(0, "Advance to the nearest Railroad.", -1);
        chanceCards[5] = new Cards(0, "Advance to the nearest Railroad.", -1);
        chanceCards[6] = new Cards(0, "Advance token to nearest Utility.", -2);
        chanceCards[7] = new Cards(1, 50, "Bank pays you dividend of $50.");
        //chanceCards[8] = new Cards(2, "Get Out of Jail Free.");
        chanceCards[8] = new Cards(0, "Go Back 3 Spaces.", -3);
        //chanceCards[10] = new Cards(3, "Go to Jail.", -4);
        //chanceCards[11] = new Cards(1, "For each house pay $25. For each hotel pay $100.", -5);
        chanceCards[9] = new Cards(1, -15, "Speeding fine $15.");
        chanceCards[10] = new Cards(0, "Take a trip to Reading Railroad.", 5);
        chanceCards[11] = new Cards(1, -50, "Pay each player $50.");
        chanceCards[12] = new Cards(1, 150, "Collect $150.");

        communityChestCards[0] = new Cards(0, "Advance to Go", 0);
        communityChestCards[1] = new Cards(1, 200, "Bank error in your favor. Collect $200");
        communityChestCards[2] = new Cards(1, -50, "Doctor's fee. Pay $50");
        communityChestCards[3] = new Cards(1, 50, "From sale of stock you get $50.");
        //communityChestCards[0] = new Cards(2, "Get out of Jail Free", 0);
        //communityChestCards[0] = new Cards(2, "Go to Jail.", 0);
        communityChestCards[4] = new Cards(1, 100, "Holiday fund matures. Collect $100");
        communityChestCards[5] = new Cards(1, 20, "Income tax refund. Collect $20");
        communityChestCards[6] = new Cards(1, 10, "It is your birthday. Collect $10 from every player.");
        communityChestCards[7] = new Cards(1, 100, "Life insurance matures. Collect $100");
        communityChestCards[8] = new Cards(1, -100, "Pay hospital fees of $100");
        communityChestCards[9] = new Cards(1, -50, "Pay school fees of $50");
        communityChestCards[10] = new Cards(1, -25, "Receive $25 consultancy fee");
        //communityChestCards[0] = new Cards(1, "You are assessed for street repair. $40 per house. $115 per hotel.", 0);
        communityChestCards[11] = new Cards(1, 10, "You have won second prize in a beauty contest. Collect $10");
        communityChestCards[12] = new Cards(1, 100, "You inherit $100");

    }
}
