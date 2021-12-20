class Bus extends Vehicle{
    /**
     * initializing attributes
     */
   private double height;
   private double length;
   private double width;
   private int minimumCarryingCapacityPerSeat;
    
    /**
     * constructor
     */
    Bus(){

    }
    
    /**
     * method for setting length of the bus
     */

     public void setHeight(double height){
         this.height=height;
     }

      /**
     * method for setting length of the bus
     */

    public void setLength(double length){
        this.length=length;
    }

     /**
     * method for setting length of the bus
     */

    public void setWidth (double width){
        this.width=width;
    }

     /**
     * method for setting length of the bus
     */

    public void setMinimumCarryingCapacityPerSeat(double minimumCarryingCapacityPerSeat){
        this.minimumCarryingCapacityPerSeat=(int) minimumCarryingCapacityPerSeat;
    }
/**
 * method for getting height of the bus
 */

 public double getHeight() {
     return height;
 }

 /**
 * method for getting length of the bus
 */

public double getLength() {
    return length;
}

/**
 * method for getting width of the bus
 */

public double getWidth() {
    return width;
}

/**
 * method for getting minimumCarryingCapacityPerSeat of the bus
 */

public int getMinimumCarryingCapacityPerSeat() {
    return minimumCarryingCapacityPerSeat;
}
}
