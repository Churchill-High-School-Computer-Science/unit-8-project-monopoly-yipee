
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;


public class Board {
    public Property[][] propers = new Property[11][11];
    static Map<Integer, Property> propertiesMap = new HashMap<>();
    
    public Board()
    {
        Display.properties = propers;
        propers[0][0] = new Property("GO", "board", 0, 0, 0, 0, new Color(0, 255, 0));
        propertiesMap.put(0, propers[0][0]);
        propers[1][0] = new Property("Mediterranean Avenue", "board", 60, 2, 0, 50, new Color(102, 51, 0));
        propertiesMap.put(1, propers[1][0]);
        propers[2][0] = new Property("Community Chest", new Color(0, 255, 0));
        propertiesMap.put(2, propers[2][0]);
        propers[3][0] = new Property("Baltic Avenue", "board", 60, 4, 0, 50, new Color(102, 51, 0));
        propertiesMap.put(3, propers[3][0]);
        propers[4][0] = new Property("Income Tax", new Color(0, 255, 0));
        propertiesMap.put(4, propers[4][0]);
        propers[5][0] = new Property("Reading Railroad", "board", 200, 25, 0, new Color(0, 0, 0));
        propertiesMap.put(5, propers[5][0]);
        propers[6][0] = new Property("Oriental Avenue", "board", 100, 6, 0, 50, new Color(0, 153, 204));
        propertiesMap.put(6, propers[6][0]);
        propers[7][0] = new Property("Chance", new Color(0, 255, 0));
        propertiesMap.put(7, propers[7][0]);
        propers[8][0] = new Property("Vermont Avenue", "board", 100, 6, 0, 50, new Color(0, 153, 204));
        propertiesMap.put(8, propers[8][0]);
        propers[9][0] = new Property("Connecticut Avenue", "board", 120, 8, 0, 50, new Color(0, 153, 204));
        propertiesMap.put(9, propers[9][0]);
        propers[10][0] = new Property("Jail", new Color(0, 1, 0));
        propertiesMap.put(10, propers[10][0]);
        propers[10][1] = new Property("St. Charles Place", "board", 140, 10, 0, 100, new Color(204, 68, 204));
        propertiesMap.put(11, propers[10][1]);
        propers[10][2] = new Property("Electric Company", "board", 150, 0, 0, new Color(0, 2, 0));
        propertiesMap.put(12, propers[10][2]);
        propers[10][3] = new Property("States Avenue", "board", 140, 10, 0, 100, new Color(204, 68, 204));
        propertiesMap.put(13, propers[10][3]);
        propers[10][4] = new Property("Virgina Avenue", "board", 160, 12, 0, 100, new Color(204, 68, 204));
        propertiesMap.put(14, propers[10][4]);
        propers[10][5] = new Property("Pennsylvania Railroad", "board", 200, 25, 0, new Color(0, 0, 0));
        propertiesMap.put(15, propers[10][5]);
        propers[10][6] = new Property("St. James Place", "board", 180, 14, 0, 100, new Color(194, 88, 30));
        propertiesMap.put(16, propers[10][6]);
        propers[10][7] = new Property("Community Chest", new Color(0, 255, 0));
        propertiesMap.put(17, propers[10][7]);
        propers[10][8] = new Property("Tennessee Avenue", "board", 180, 14, 0, 100, new Color(194, 88, 30));
        propertiesMap.put(18, propers[10][8]);
        propers[10][9] = new Property("New York Avenue", "board", 200, 16, 0, 100, new Color(194, 88, 30));
        propertiesMap.put(19, propers[10][9]);
        propers[10][10] = new Property("Free Parking", new Color(255, 255, 255));
        propertiesMap.put(20, propers[10][10]);
        propers[9][10] = new Property("Kentucky Avenue", "board", 220, 18, 0, 150, new Color(255, 0, 0));
        propertiesMap.put(21, propers[9][10]);
        propers[8][10] = new Property("Chance", new Color(0, 255, 0));
        propertiesMap.put(22, propers[8][10]);
        propers[7][10] = new Property("Indiana Avenue", "board", 220, 18, 0, 150, new Color(255, 0, 0));
        propertiesMap.put(23, propers[7][10]);
        propers[6][10] = new Property("Illinois Avenue", "board", 240, 20, 0, 150, new Color(255, 0, 0));
        propertiesMap.put(24, propers[6][10]);
        propers[5][10] = new Property("B&O Railroad", "board", 200, 25, 0, new Color(0, 0, 0));
        propertiesMap.put(25, propers[5][10]);
        propers[4][10] = new Property("Atlantic Avenue", "board", 260, 22, 0, 150, new Color(255, 255, 51));
        propertiesMap.put(26, propers[4][10]);
        propers[3][10] = new Property("Ventnor Avenue", "board", 260, 22, 0, 150, new Color(255, 255, 51));
        propertiesMap.put(27, propers[3][10]);
        propers[2][10] = new Property("Water Works", "board", 150, 0, 0, new Color(0, 2, 0));
        propertiesMap.put(28, propers[2][10]);
        propers[1][10] = new Property("Marvin Gardens", "board", 280, 24, 0, 150, new Color(255, 255, 51));
        propertiesMap.put(29, propers[1][10]);
        propers[0][10] = new Property("Go to Jail", new Color(0, 1, 0));
        propertiesMap.put(30, propers[0][10]);
        propers[0][9] = new Property("Pacific Avenue", "board", 300, 26, 0, 200, new Color(51, 153, 51));
        propertiesMap.put(31, propers[0][9]);
        propers[0][8] = new Property("North Carolina Avenue", "board", 300, 26, 0, 200, new Color(51, 153, 51));
        propertiesMap.put(32, propers[0][8]);
        propers[0][7] = new Property("Community Chest", new Color(0, 255, 0));
        propertiesMap.put(33, propers[0][7]);
        propers[0][6] = new Property("Pennsylvania Avenue", "board", 320, 28, 0, 200, new Color(51, 153, 51));
        propertiesMap.put(34, propers[0][6]);
        propers[0][5] = new Property("Short Line Railroad", "board", 200, 25, 0, new Color(0, 0, 0));
        propertiesMap.put(35, propers[0][5]);
        propers[0][4] = new Property("Chance", new Color(0, 255, 0));
        propertiesMap.put(36, propers[0][4]);
        propers[0][3] = new Property("Park Place", "board", 350, 35, 0, 200, new Color(51, 153, 51));
        propertiesMap.put(37, propers[0][3]);
        propers[0][2] = new Property("Luxury Tax", 75, new Color(0, 255, 0));
        propertiesMap.put(38, propers[0][2]);
        propers[0][1] = new Property("Boardwalk", "board", 400, 50, 0, 200, new Color(51, 153, 51));
        propertiesMap.put(39, propers[0][1]);
    }
}
