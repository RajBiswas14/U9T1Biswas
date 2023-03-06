public class Heli extends Vehicle{
    private int blades;


    public Heli(String name, int wheels, int blades){
        super(name,wheels);
        this.blades = blades;
    }

    public int getBlades(){
        return blades;
    }
}
