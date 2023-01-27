package AbstractAndInterfaces.Theory;

public class Main {
    public static void main(String[] args) {
        ITelephone ivan = new DeskPhone(121212);
        ivan.powerOn();
        ivan.callPhone(121212);
        ivan.answer();


        System.out.println("\nMobile Phone : ");
        ivan = new MobilePhone(232323);
        ivan.powerOn();
        ivan.callPhone(232323);
        ivan.answer();
    }
}
