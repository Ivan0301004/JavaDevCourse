package AbstractAndInterfaces.InnerClass;


import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private final int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int gear, double ratio) {
        if (gear > 0
            && gear <= maxGears) {
            this.gears.add(new Gear(gear, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0
            && newGear < this.gears.size()
            && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind");
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream");
            return 0.0;
        } else {
            return revs * gears.get(currentGear).ratio;
        }
    }


    public class Gear {
        private int gearNumber;
        private double ratio;


        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }


        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
