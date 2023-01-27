package AbstractAndInterfaces.Theory;

public class MobilePhone implements ITelephone {
    private final int myNumber;
    private boolean isRing;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println(isOn
            ? "Now ringing " + phoneNumber + " on mobile phone"
            : "Phone is switched off"
        );
    }

    @Override
    public void answer() {
        System.out.println(
            isRing
                ? "Answer the mobile phone "
                : "No answer");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRing = true;
            System.out.println("Ring ring");
        } else {
            isRing = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRing;
    }

    @Override
    public boolean isRinging() {
        return isRing;
    }
}
