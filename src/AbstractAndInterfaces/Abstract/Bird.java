package AbstractAndInterfaces.Abstract;

public abstract class Bird extends Animal{


    public Bird(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(getName() + " Is pecking.");
    }

    @Override
    public void breath(){
        System.out.println("My fucking bird is breathing");
    }

    public abstract void fly();

}
