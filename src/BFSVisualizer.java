import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BFSVisualizer {
    
    private JFrame frame;
    private Graph graph;

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
                System.out.println("Button Seach clicked");
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
        
        Graphics g = frame.getGraphics();
        Font font = new Font("Comic Sans", Font.BOLD, 50);
        g.setFont(font);
        g.setColor(Color.BLACK);
        //Draw A
        int x = 400;
        int y = 100;
        g.drawOval(x, y, 100, 100);
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 100, 100);
        g.setColor(Color.BLACK);
        g.drawString("A", x + 30, y + 60);
          
    }
}
