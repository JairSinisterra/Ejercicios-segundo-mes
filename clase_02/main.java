public class main {
    public static void main(String[] args) {
        System.out.println();
        Vehiculo vehiculo1 = new Vehiculo("KIA", "RA2471", 140);
        vehiculo1.ShowDetails();
        System.out.println();
        Car vehiculo2 = new Car("MAZDA", "Mazda 3", 160, 4);
        System.out.println(vehiculo2.toString());
        vehiculo2.ShowDetails();
        System.out.println();
        Vehiculo vehiculo3 = new Vehiculo("FORD", "Ford Loyal", 180);
        vehiculo3.ShowDetails();
        System.out.println();
    
    
    }
}
