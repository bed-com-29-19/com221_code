public class CarsMain{
    public static void main(String[] args){
        PickUps hilux = new PickUps();
        System.out.println(hilux.getNumberOfTryes());
        hilux.setColor("red");
        System.out.println(hilux.getColor());

        //creating a bus object
        Bus schoolBus = new Bus();
        System.out.println("This is a School Bus and has "+schoolBus.getNumberOfTryes()" tyers");
        schoolBus.setColor("silver");
        schoolBus.setHeight(3.81);
        schoolBus.setLength(12);
        schoolBus.setWidth(2.55);
        schoolBus.setMinimumCarryingCapacityPerSeat(49);
        System.out.println(schoolBus.getColor());

    }
}