package gr.aueb.sev.ch17;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book.Builder(1L, "123")
                .author("Andreas")
                .build();
    }
}
