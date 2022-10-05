public class Vehicle {

    String brand;
    String model;
    String registrationNumber;
    Person owner;

    Vehicle(String brand, String model, String registrationNumber, Person owner){
        //
    }
    String getInfo(){
        //
    }
    void tranferOwnership(Person newOwer){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
