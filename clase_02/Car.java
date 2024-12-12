public class Car extends Vehiculo{
    public int numOfDoors;

    public Car(String brand, String model, int maxSpeed, int numOfDoors){
    super(brand, model, maxSpeed);
    this.numOfDoors = numOfDoors;
    }
    
    @Override
    public String toString() {
        return "Car [Numero de puertas = " + numOfDoors + "]";
    }
    public int getNumOfDoors(){
        return numOfDoors;
    }
    public void setNumOfDoors(int numOfDoors){
        this.numOfDoors = numOfDoors;
    }
}
