package AbstractAndInterfaces.Theory;

public class DeskPhone implements ITelephone {
    private final int myNumber;
    private boolean isRing;

    public DeskPhone(int number) {
        this.myNumber = number;
    }

    @Override
    public void powerOn() {
        System.out.println("No action this phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desktop.");
    }

    @Override
    public void answer() {
        System.out.println(
            isRing
                ? "Answer the desk phone "
                : "No answer");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRing = true;
            System.out.println("Ring ring");
        } else {
            isRing = false;
        }
        return isRing;
    }

    @Override
    public boolean isRinging() {
        return isRing;
    }
}
