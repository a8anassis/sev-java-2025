package gr.aueb.sev.ch14;

/**
 * Singleton Design Pattern.
 */
public class CodingFactory {

    private static final CodingFactory INSTANCE = new CodingFactory();

    private CodingFactory() {

    }

    public static CodingFactory getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello World!");
    }
}
