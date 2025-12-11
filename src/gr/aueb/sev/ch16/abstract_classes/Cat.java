package gr.aueb.sev.ch16.abstract_classes;


public class Cat extends Animal {

    public Cat() {
    }

    public Cat(long id, String name) {
        super(id, name);
    }

    @Override
    public void speak() {
        System.out.println( "Meow!");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
