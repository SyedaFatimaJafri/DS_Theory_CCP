package package1;
import java.util.*;

public class TrafficSystem {
    Graph cityGraph = new Graph();
    Map<String, TrafficQueue> intersectionQueues = new HashMap<>();

    public void setupCity() {
        cityGraph.addRoad("A", "B", 2);
        cityGraph.addRoad("B", "C", 3);
        intersectionQueues.put("A", new TrafficQueue());
        intersectionQueues.put("B", new TrafficQueue());
    }

    public void simulateTraffic() {
        TrafficQueue queueA = intersectionQueues.get("A");

        queueA.addVehicle(new Vehicle("V1", false));
        queueA.addVehicle(new Vehicle("V2", true));
        queueA.addVehicle(new Vehicle("V3", false));

        System.out.println("Queue at Intersection A:");
        queueA.displayQueue();

        System.out.println("\nProcessing vehicles...");
        while (!queueA.isEmpty()) {
            Vehicle next = queueA.nextVehicle();
            System.out.println("Vehicle cleared: " + next);
        }

        int greenTime = calculateGreenTime(3); // Example queue length = 3
        System.out.println("\nGreen Light Time: " + greenTime + " seconds");
    }

    public int calculateGreenTime(int queueLength) {
        return Math.min(60, queueLength * 2);
    }

    public static void main(String[] args) {
        TrafficSystem system = new TrafficSystem();
        system.setupCity();
        system.simulateTraffic();
    }
}

