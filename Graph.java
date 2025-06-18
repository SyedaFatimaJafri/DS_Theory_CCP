package package1;
import java.util.*;

class Graph {
    Map<String, List<Road>> adjList = new HashMap<>();

    public void addRoad(String src, String dest, int weight) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.get(src).add(new Road(dest, weight));
    }

    public List<Road> getNeighbors(String node) {
        return adjList.getOrDefault(node, new ArrayList<>());
    }
}
