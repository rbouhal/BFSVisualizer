import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BFSVisualizer {
    
    private JFrame frame;
    private Graph graph;

    public BFSVisualizer() {
        graph = new Graph();
        frame = new JFrame("BFS Visualizer");
        frame.setSize(1000, 800);
        frame.setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Create the buttons and add them to the panel
        JButton GraphButton1 = new JButton("Graph 1");
        JButton GraphButton2 = new JButton("Graph 2");
        JButton GraphButton3 = new JButton("Graph 3");
        // Create the action listeners
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeGraph1();
            }
        };

        ActionListener listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 clicked");
            }
        };

        ActionListener listener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 3 clicked");
            }
        };

        // Register the action listeners with the buttons
        GraphButton1.addActionListener(listener1);
        GraphButton2.addActionListener(listener2);
        GraphButton3.addActionListener(listener3);
        buttonPanel.add(GraphButton1);
        buttonPanel.add(GraphButton2);
        buttonPanel.add(GraphButton3);

        // Add the button panel to the top of the window
        frame.add(buttonPanel, BorderLayout.NORTH);
        JButton search = new JButton("Search Shortest Path");
        ActionListener listener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPath();
            }
        };
        search.addActionListener(listener4);
        frame.add(search, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
    
    public void makeGraph1()
    {
        graph = new Graph();
        String[] letters = {"A", "B", "C", "D", "E", "F"};
        for(String s: letters)
        {
            graph.addVertex(s);
        }
        
        graph.addEdge("A", "B");
        graph.addEdge("B","D");
        graph.addEdge("B", "E");
        graph.addEdge("A", "C");
        graph.addEdge("C", "F");
        
        
       
        Graphics g = frame.getGraphics();
        Font font = new Font("Comic Sans", Font.BOLD, 50);
        g.setFont(font);
        g.setColor(Color.BLACK);
        
        //Draw Edge AB
        int xA = 400;
        int yA = 100;
        int xB = 200;
        int yB = 200;
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(7));
        g.drawLine(xA + 50, yA + 50, xB + 50, yB+50);
        
        //Draw Edge AC
        int xC = 600;
        int yC = 200;
        g.drawLine(xA + 50, yA + 50, xC + 50, yC+50);
        
        //Draw Edge BD
        int xD = 100;
        int yD = 400;
        g.drawLine(xB + 50, yB + 50, xD + 50, yD+50);
        
        //Draw Edge BE
        int xE = 300;
        int yE = 400;
        g.drawLine(xB + 50, yB + 50, xE + 50, yE+50);
        
        //Draw Edge CF
        int xF = 600;
        int yF = 400;
        g.drawLine(xC + 50, yC + 50, xF + 50, yF+50);
        
        //Draw Vertex A
        g.drawOval(xA, yA, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xA, yA, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("A", xA + 30, yA + 60);
        
        //Draw Vertex B
        
        g.drawOval(xB, yB, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xB, yB, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("B", xB + 30, yB + 60);
        
        //Draw Vertex C
        g.drawOval(xC, yC, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xC, yC, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("C", xC + 30, yC + 60);
        
        //Draw Vertex D
        g.drawOval(xD, yD, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xD, yD, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("D", xD + 30, yD + 60);
        
        //Draw Vertex E
        g.drawOval(xE, yE, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xE, yE, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("E", xE + 30, yE + 60);
        
        //Draw Vertex F
        g.drawOval(xF, yF, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xF, yF, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("F", xF + 30, yF + 60);
          
    }
    
    public void drawPath() {
        String s = graph.writePath("A", "F");
        JLabel label = new JLabel(s);
        frame.add(label);
    }



}
