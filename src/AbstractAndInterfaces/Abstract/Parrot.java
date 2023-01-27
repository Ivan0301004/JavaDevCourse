package AbstractAndInterfaces.Abstract;

public class Parrot extends Bird{
    public Parrot(String name){
        super(name);
    }

    @Override
    public void fly(){
        System.out.println("I can fly on the entire earth");
    }
}
