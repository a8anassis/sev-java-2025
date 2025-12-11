package gr.aueb.sev.ch16.abstract_classes;

public abstract class Animal {
    private long id;
    private String name;

    public Animal() {

    }

    public Animal(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void speak();

    public void eat() {
        System.out.println("Eating...");
    }
}
