import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BFSVisualizer {

    public BFSVisualizer() {
        // TODO Auto-generated constructor stub
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("My GUI Application");
        frame.setSize(400, 300);
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
                System.out.println("Button 1 clicked");
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

        // Add a label and a button to the center and the bottom of the window
// JLabel label = new JLabel("Hello, World!");
//
// frame.add(label, BorderLayout.CENTER);
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

}
