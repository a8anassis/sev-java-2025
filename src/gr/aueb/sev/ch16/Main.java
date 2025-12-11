package gr.aueb.sev.ch16;

public class Main {

    public static void main(String[] args) {
        ISpeakable speakable = new Cat("Zozo");
        ISpeakable speakable2 = new Dog("Bob", 3);

        doSpeak(speakable);
        doSpeak(speakable2);
    }

    /**
     * Polymorphism.
     * @param speakable
     */
    public static void doSpeak(ISpeakable speakable) {
        speakable.speak();
    }
}
