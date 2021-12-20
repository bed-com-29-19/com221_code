public class CarsMain{
    public static void main(String[] args){
        PickUps hilux = new PickUps();
        System.out.println(hilux.getNumberOfTryes());
        hilux.setColor("red");
        System.out.println(hilux.getColor());

        //creating a bus object
        Bus schoolBus = new Bus();
        //assigning values to attributes of schoolBus object
        schoolBus.setColor("silver");
        schoolBus.setHeight(3.81);
        schoolBus.setLength(12);
        schoolBus.setWidth(2.55);
        schoolBus.setMinimumCarryingCapacityPerSeat(49);
        /**
         * print out statements
         */
        System.out.println();
        System.out.println("This is a School Bus \nThis Bus has "+schoolBus.getNumberOfTryes()+" tyers and is  "+schoolBus.getColor()+ " in colour\nIt carries "+schoolBus.getMinimumCarryingCapacityPerSeat()+" students");
        System.out.println("These are its dimensions in meters\nHeight is "+schoolBus.getHeight()+"\nWidth is  "+schoolBus.getWidth()+" \nlength is "+schoolBus .getLength());
    }
}