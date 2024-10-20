import java.util.ArrayList;
import java.util.List;


public class grafos {
    private int vertices;
    private List<List<Integer>> adjList;

    public grafos(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.println("Vertice " + i + ":");
            for (Integer adjVertex : adjList.get(i)) {
                System.out.println(adjVertex + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        grafos g = new grafos(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}
