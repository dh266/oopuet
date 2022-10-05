import java.util.List;

public class Person {

    String name;
    String address;
    List<Vehicle> vehiclesList;

    Person(String name, String address){
        //
    }
    void addVehicle(Vehicle vehicle){
        //
    }
    void removeVehicle(String registratonNumber){
        //
    }
    String getVehicleInfo(){
        //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
