class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;
    String version;
    int range;
    
    void set(int p, int f, int m, String v){
    passengers = p;
    fuelcap = f;
    mpg = m;
    version = v;
    }
    int range(){
    return fuelcap * mpg;
    }
    
    void text(){
    range = range();
    System.out.println(version + " может перевести " + passengers + " человек на расстояние " + range + " миль");
    }
}

public class TwoVehicle {
    public static void main(String[] args) {
       Vehicle car1 = new Vehicle(); 
       Vehicle car2 = new Vehicle();
       Vehicle car3 = new Vehicle();
       Vehicle car4 = new Vehicle();
       Vehicle car5 = new Vehicle();
    
       car1.set(4, 200, 100, "minivan");
       car2.set(2, 250, 300, "sportscar");
       car3.set(10, 500, 500, "bus");
       car4.set(50, 1000, 1500, "train");
       car5.set(1000, 10000, 5000, "plain");
    
       car1.text();
       car2.text();
       car3.text();
       car4.text();
       car5.text();

    }
}