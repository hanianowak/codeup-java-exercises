import com.sun.deploy.util.SessionState;

public class Person {

//    Create Person class inside of src that has a private name property that is a string, and the following methods:

//    The class should have a constructor that accepts a string value and sets the person's name to the passed string.
//


    private String name;

    public Person(String name) {
        this.name = name;
    }

    
    // returns the person's name
    public String getName() {
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }


    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + name);
    }


    //    Create a main method on the class that creates a new Person object and tests the above methods.
    public static void main(String[] args) {

        Person client1 = new Person("Hania");

        System.out.println(client1.getName());
        client1.sayHello();


//        Person person1 = new Person();
//        person1.name=  "John";
//        Person person2 = new Person();
//        person2.name = "John";

//        Person person1 = new Person();
//        person1.name=  "John";
//        Person person2 = person1;


        Person person1 = new Person("John");
        Person person2 = person1;

//        Type varName = EXPR;  // expression - executes/evaluates something, and MIGHT return something
        

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println("P1 name: " + person1.getName());
        System.out.println("P2 name: " + person2.getName());


        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    }


}
