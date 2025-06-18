package package1;

import java.util.*;

class TrafficQueue {
    Queue<Vehicle> normalQueue = new LinkedList<>();
    PriorityQueue<Vehicle> emergencyQueue = new PriorityQueue<>(Comparator.comparing(v -> v.id));

    public void addVehicle(Vehicle v) {
        if (v.isEmergency) emergencyQueue.offer(v);
        else normalQueue.offer(v);
    }

    public Vehicle nextVehicle() {
        return !emergencyQueue.isEmpty() ? emergencyQueue.poll() : normalQueue.poll();
    }

    public int totalQueueSize() {
        return emergencyQueue.size() + normalQueue.size();
    }

    public boolean isEmpty() {
        return emergencyQueue.isEmpty() && normalQueue.isEmpty();
    }

    public void displayQueue() {
        System.out.println("Emergency: " + emergencyQueue);
        System.out.println("Normal: " + normalQueue);
    }
}

