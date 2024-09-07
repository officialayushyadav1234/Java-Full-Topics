package inheritance.SingleLevel;

public class Animal {
    
    public void eat(){
        System.out.println("The Animal is eating");
    }

}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("The Dog is eating");
    }
}