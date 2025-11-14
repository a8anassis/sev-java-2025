package gr.aueb.sev.ch12.review;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        // Populate
        teacher.setId(1);
        teacher.setFirstname("John");
        teacher.setLastname("Lennon");

        // Declare, init & populate
        Teacher teacher2 = new Teacher(1, "Athanassios", "Androutsos");

        System.out.println("Firstname: " + teacher.getFirstname());
        System.out.println("Lastname: " + teacher.getLastname());
        System.out.println("Id: " + teacher.getId());
    }
}
