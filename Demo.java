// Demo.java
public class Demo {
    public static void main(String[] args) {
        // Testing Person class
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        // Testing Student class
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        // Testing Teacher class
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        // Testing CollegeStudent class
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
