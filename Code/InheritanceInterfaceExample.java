
interface Animal {
    void sound();
}


class AnimalBase {
    void eat() {
        System.out.println("Animal is eating.");
    }
}


class Dog extends AnimalBase implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

public class InheritanceInterfaceExample {
    public static void main(String[] args) {
        
        Dog dog = new Dog();

        
        dog.eat();

        
        dog.sound();
    }
}
