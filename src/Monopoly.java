import javax.swing.SwingUtilities;

public class Monopoly {
    public static void main(String[] args) {
        Board b = new Board();
        Player p1 = new Player("me");
        Player p2 = new Player("yipee");
        Player p3 = new Player("yipe");
        Player p4 = new Player("yee");

        Display.players.add(p1);
        Display.players.add(p2);
        Display.players.add(p3);
        Display.players.add(p4);
        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
    }
}
