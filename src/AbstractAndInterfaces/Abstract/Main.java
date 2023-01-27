package AbstractAndInterfaces.Abstract;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Max");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Nigga");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin pen = new Penguin("Emperor");
        pen.fly();


    }
}
