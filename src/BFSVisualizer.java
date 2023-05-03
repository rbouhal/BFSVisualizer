import cs2.Window;
import cs2.WindowSide;
import java.util.List;
import cs2.Button;
import cs2.TextShape;
public class BFSVisualizer {

    private Window window;
    private Button graph1;
    private Graph graph;
    public BFSVisualizer() {
        
       window = new Window("Breadth-first Search");
       graph1= new Button("Graph 1");
       window.addButton(graph1, WindowSide.NORTH);
       graph1.onClick(this, "clickedGraph1");
       
       makeGraph();
    }
    
    
    public void makeGraph() {
        
        graph = new Graph();
        String[] letters = {"A", "B", "C", "D", "E", "F"};
        
        for(String s: letters)
        {
            graph.addVertex(s);
        }
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");
        String s =graph.writePath("A", "D");
        TextShape label = new TextShape(100,100,s);
        window.addShape(label);
        
        
        
        
        /*
         * if you want to make connections between verticies
         *  graph.addEdge("A", "B");
         *  graph.addEdge("B", "C");
         *  graph.addEdge("C", "D");
         * 
         * if you want to find the shortest path between
         * two nodes
         * 
         * graph.breadthFirstSearch("A", "F");
         * if you made the graph in a line
         * like my dumbass, this will return a 
         * List<String>, you can use 
         * 
         *  graph.breadthFirstSearch("A", "F").toString to 
         *  return: [A,B,C,D,E,F]
         *  A-B-C-D-
         * 
         * if you want look bellow
         */
        
       
        
        
        
    }
    
    public void clickedGraph1(Button b) {

       
    }

  

}
