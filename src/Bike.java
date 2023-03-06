public class Bike extends Vehicle {
    private int gears;

    public Bike(String name, int wheels, int gears){
        super(name, wheels);
        this.gears = gears;
    }

    public int getGears(){
        return gears;
    }

    public void ringBell(){
        System.out.println("Ring Ring!!");
    }
}
