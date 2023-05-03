import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BFSVisualizer {
    
    private JFrame frame;
    private Graph graph;
    private String v2;

    public BFSVisualizer() {
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
                makeGraph2();
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
        
        v2 = "F";
        
        Graph1 graph1 = new Graph1();
        frame.getContentPane().add(graph1);
        frame.revalidate(); // Update the layout of the JFrame
        
          
    }
    
    public void makeGraph2()
    {
        frame.revalidate();
        graph = new Graph();
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"};
        for(String s: letters)
        {
            graph.addVertex(s);
        }
        
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("A", "E");
        graph.addEdge("A", "F");
        graph.addEdge("B", "G");
        graph.addEdge("B", "H");
        graph.addEdge("B", "G");
        graph.addEdge("C", "I");
        graph.addEdge("E", "J");
        graph.addEdge("E", "K");
        graph.addEdge("E", "L");
        graph.addEdge("F", "M");
        
        Graphics g = frame.getGraphics();
        Font font = new Font("Comic Sans", Font.BOLD, 50);
        g.setFont(font);
        g.setColor(Color.BLACK);
        
        //Draw Edge AB
        int xA = 425;
        int yA = 150;
        int xB = 125;
        int yB = 200;
        
        v2 = "L";
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(7));
        g.drawLine(xA + 50, yA + 50, xB + 50, yB+50);
        
        //Draw Edge AC
        int xC = 250;
        int yC = 250;
        g.drawLine(xA + 50, yA + 50, xC + 50, yC+50);
        
        //Draw Edge AD
        int xD = 425;
        int yD = 300;
        g.drawLine(xA + 50, yA + 50, xD + 50, yD+50);
        
        //Draw Edge AE
        int xE = 600;
        int yE = 250;
        g.drawLine(xA + 50, yA + 50, xE + 50, yE+50);
        
        //Draw Edge AF
        int xF = 725;
        int yF = 200;
        g.drawLine(xA + 50, yA + 50, xF + 50, yF+50);
        
        //Draw Edge BG
        int xG = 20;
        int yG = 350;
        g.drawLine(xB + 50, yB + 50, xG + 50, yG+50);
        
        //Draw Edge BH
        int xH = 115;
        int yH = 450;
        g.drawLine(xB + 50, yB + 50, xH + 50, yH+50);
        
        //Draw Edge CI
        int xI = 250;
        int yI = 450;
        g.drawLine(xC + 50, yC + 50, xI + 50, yI+50);
        
        //Draw Edge EJ
        int xJ = 450;
        int yJ = 425;
        g.drawLine(xE + 50, yE + 50, xJ + 50, yJ+50);
        
        //Draw Edge EK
        int xK = 575;
        int yK = 450;
        g.drawLine(xE + 50, yE + 50, xK + 50, yK+50);
        
        //Draw Edge EL
        int xL = 700;
        int yL = 415;
        g.drawLine(xE + 50, yE + 50, xL + 50, yL+50);
        
        //Draw Edge FM
        int xM = 875;
        int yM = 350;
        g.drawLine(xF + 50, yF + 50, xM + 50, yM+50);
        
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
        
      //Draw Vertex G
        g.drawOval(xG, yG, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xG, yG, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("G", xG + 30, yG + 60);
        
      //Draw Vertex H
        g.drawOval(xH, yH, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xH, yH, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("H", xH + 30, yH + 60);
        
      //Draw Vertex I
        g.drawOval(xI, yI, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xI, yI, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("I", xI + 30, yI + 60);

        //Draw Vertex J
        g.drawOval(xJ, yJ, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xJ, yJ, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("J", xJ + 30, yJ + 60);

        //Draw Vertex K
        g.drawOval(xK, yK, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xK, yK, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("K", xK + 30, yK + 60);

        //Draw Vertex L
        g.drawOval(xL, yL, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xL, yL, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("L", xL + 30, yL + 60);

        //Draw Vertex M
        g.drawOval(xM, yM, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(xM, yM, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("M", xM + 30, yM + 60);
    }
    
    public void drawPath() {
        if (graph != null)
        {
            String s = graph.writePath("A", v2);
            JLabel label = new JLabel(s);
            Font font = label.getFont();
            label.setFont(new Font(font.getName(), font.getStyle(), 60)); // set font size to 18
            // create a layered pane and add the label to it
            JLayeredPane layeredPane = frame.getRootPane().getLayeredPane();
            layeredPane.add(label, JLayeredPane.PALETTE_LAYER);
            
            // set the position of the label
            label.setBounds(550, 600, 600, 100);
            
            frame.setVisible(true);
        }
        
        
    }
    
    



}
