import java.util.*;

public class Graph {
    private Map<String, List<String>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<String, List<String>>();
    }

    public void addVertex(String vertex) {
        adjacencyList.put(vertex, new ArrayList<String>());
    }

    public void addEdge(String vertex1, String vertex2) {
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
    }

    public List<String> breadthFirstSearch(String start, String end) {
        List<String> path = new ArrayList<String>();
        Map<String, String> parentMap = new HashMap<String, String>();
        Queue<String> queue = new LinkedList<String>();
        Set<String> visited = new HashSet<String>();

        queue.offer(start);
        visited.add(start);
        parentMap.put(start, null);

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (current.equals(end)) {
                String parent = parentMap.get(end);
                while (parent != null) {
                    path.add(0, end);
                    end = parent;
                    parent = parentMap.get(end);
                }
                path.add(0, start);
                return path;
            }

            for (String neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                    parentMap.put(neighbor, current);
                }
            }
        }

        return null;
    }
    
    public List<String[]> getEdges() {
        List<String[]> edges = new ArrayList<String[]>();
        Set<String> visited = new HashSet<String>();

        for (String vertex : adjacencyList.keySet()) {
            visited.add(vertex);
            for (String neighbor : adjacencyList.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    edges.add(new String[]{vertex, neighbor});
                }
            }
        }

        return edges;
    }
    
    public String writePath(String start, String end) {
        List<String> list = this.breadthFirstSearch(start, end);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
        {
            sb.append(list.get(i) + "-");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
        
    }
    
}