public class main {
    public static void main(String[] args) {
    
   
        Estudiante estudiante = new Estudiante("Luisa", 25, 3.6);
        Estudiante estudiante2 = new Estudiante("Jair", 30, 4.0);
        Estudiante estudiante3 = new Estudiante("Fernando", 15, 2.6);
        Estudiante estudiante4 = new Estudiante("Luis", 17, 1.6);
        Estudiante estudiante5 = new Estudiante("Tatiana", 28, 2.8);
        System.out.println("");
        
      
        System.out.println("");
    
        System.out.println("==========================");
        estudiante.showdetails();
        estudiante.getaverage();
        System.out.println("==========================");
        estudiante2.showdetails();
        estudiante2.getaverage();
        System.out.println("==========================");
        estudiante3.showdetails();
        estudiante3.getaverage();
        System.out.println("==========================");
        estudiante4.showdetails();
        estudiante4.getaverage();
        System.out.println("==========================");
        estudiante5.showdetails();
        estudiante5.getaverage();
        
        
        System.out.println("");
     
    
    }
}
