package package1;

class Vehicle {
    String id;
    boolean isEmergency;

    Vehicle(String id, boolean isEmergency) {
        this.id = id;
        this.isEmergency = isEmergency;
    }

    @Override
    public String toString() {
        return id + (isEmergency ? " [EMERGENCY]" : "");
    }
}


