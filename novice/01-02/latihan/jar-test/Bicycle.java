class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public Bicycle(int cadence , int speed , int gear)
    {
        cadence = this.cadence;
        speed = this.speed;
        gear = this.gear;
    }

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }

    public static void main (String[] args)
    {
        Bicycle bicycle = new Bicycle(1, 2, 3);
        System.out.println("current state = ");
        bicycle.printStates();
    }
}
