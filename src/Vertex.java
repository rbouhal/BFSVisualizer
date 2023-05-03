import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Vertex extends JPanel {
    private char letter;

    public Vertex(char letter) {
        this.letter = letter;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Draw circle with the letter
        int centerX = getWidth() / 2;
        g2.setColor(Color.BLACK);
        g2.drawOval(centerX - 25, 10, 50, 50);
        g2.setFont(new Font("Arial", Font.BOLD, 24));
        g2.drawString(Character.toString(letter), centerX - 6, 42);
    }
}
