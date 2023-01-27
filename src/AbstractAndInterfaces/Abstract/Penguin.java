package AbstractAndInterfaces.Abstract;

public class Penguin extends Bird{
    public Penguin(String name){
        super(name);
    }

    @Override
    public void breath(){
        System.out.println("Im a Emperor penguin i am the shit in the Antarctic continent");
    }

    @Override
    public void fly() {
        System.out.println("I cant fly but i can swim instead");
    }
}
