public class Estudiante {
    String name;
    int age;
    double average;


// Constructor

    public Estudiante(String name, int age, double average) {
        this.name = name;
        this.age = age;
        this.average = average;

    }
// getters and setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getAverage() {
        return average;
    }
    public void setAverage(double average) {
        this.average = average;
    }

    // Show Details 

    public void showdetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grades Average: "+average);
        
    }
   public void getaverage(){
    if(average >= 3){
        System.out.println("El estudiante ha aprovado");
    }else{
        System.out.println("El estudiante no ha aprovado");
    }
   }
}
