import java.awt.*;
import javax.swing.*;

public class Graph1 extends JPanel {
    private static final long serialVersionUID = 1L;
    private static final int OVAL_SIZE = 100;
    private static final int TEXT_OFFSET_X = 30;
    private static final int TEXT_OFFSET_Y = 60;
    private static final int LINE_OFFSET = 50;
    private static final int STROKE_WIDTH = 7;
    
    private Graphics2D g2;
    private Font font;
    
    public Graph1() {
        font = new Font("Comic Sans", Font.BOLD, 50);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setFont(font);
        g2.setColor(Color.BLACK);
        
        drawEdge(400, 100, 200, 200);
        drawEdge(400, 100, 600, 200);
        drawEdge(200, 200, 100, 400);
        drawEdge(200, 200, 300, 400);
        drawEdge(600, 200, 600, 400);
        
        drawVertex(400, 100, "A");
        drawVertex(200, 200, "B");
        drawVertex(600, 200, "C");
        drawVertex(100, 400, "D");
        drawVertex(300, 400, "E");
        drawVertex(600, 400, "F");
        
        
    }
    
    private void drawEdge(int x1, int y1, int x2, int y2) {
        g2.setStroke(new BasicStroke(STROKE_WIDTH));
        g2.drawLine(x1 + LINE_OFFSET, y1 + LINE_OFFSET, x2 + LINE_OFFSET, y2 + LINE_OFFSET);
    }
    
    private void drawVertex(int x, int y, String label) {
        g2.drawOval(x, y, OVAL_SIZE, OVAL_SIZE);
        g2.setColor(Color.WHITE);
        g2.fillOval(x, y, OVAL_SIZE, OVAL_SIZE);
        g2.setColor(Color.BLACK);
        g2.drawString(label, x + TEXT_OFFSET_X, y + TEXT_OFFSET_Y);
    }
}
