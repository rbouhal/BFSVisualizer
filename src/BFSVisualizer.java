import cs2.Window;
import cs2.WindowSide;
import cs2.Button;
public class BFSVisualizer {

    private Window window;
    private Button graph1;
    public BFSVisualizer() {
        
       window = new Window("Breadth-first Search");
       graph1= new Button("Graph 1");
       window.addButton(graph1, WindowSide.NORTH);
       graph1.onClick(this, "clickedGraph1");
    }
    
    public void clickedGraph1(Button b) {

       
    }

  

}
