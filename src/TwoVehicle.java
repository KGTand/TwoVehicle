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
    
       car1.set(4, 200, 100, "minivan");
       car2.set(2, 250, 300, "sportscar");
    
       car1.text();
       car2.text();

    }
}