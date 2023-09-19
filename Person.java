public class Person {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Accessor (getter) method for the 'name' field
    public String getName() {
        return name;
    }

    // Mutator (setter) method for the 'name' field
    public void setName(String name) {
        this.name = name;
    }

    // Accessor (getter) method for the 'age' field
    public int getAge() {
        return age;
    }

    // Mutator (setter) method for the 'age' field
    public void setAge(int age) {
        if (age >= 0) { // Ensure age is non-negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30);

        // Access and print the current values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modify the values using mutator methods
        person.setName("Bob");
        person.setAge(25);

        // Access and print the updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
