public class Vehiculo {
    String brand;
    String model;
    int maxSpeed;
    
    public Vehiculo(){
    
    }
    public Vehiculo(String brand, String model, int maxSpeed){
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    
    public void ShowDetails(){
        System.out.println("Marca del Vehiculo: "+brand);
        System.out.println("Modelo del Vehiculo: "+model);
        System.out.println("Velocidad Maxima: "+maxSpeed);
    }
}
