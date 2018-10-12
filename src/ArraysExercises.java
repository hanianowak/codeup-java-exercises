//
//import java.util.*;
//
//public class ArraysExercises {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//
//
////        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
////        Iterate through the array and print out the name of each person in the array.
//
//        Person[] persons = new Person[3];
//
//        persons[0] = new Person("Hania");
//        persons[1] = new Person("Agata");
//        persons[2] = new Person("Alicja");
//
//
//        for (Person person : persons) {
//            System.out.println(person.getName());
//        }
//
////        Person newItem = new Person("bob");
//        persons = addPerson(persons, "Bob");
//        for (Person element : persons) {
//            System.out.println(element);
//
//        }
//    }
//
//
////    Create a static method named addPerson. It should accept an array of Person objects,
////    as well as a single person object to add to the passed array. It should return an array
////    whose length is 1 greater than the passed array, with the passed person object at the end of the array.
//
//    public static String[] addPerson(Person[] persons, String newItem) {
//
//        int currentSize = persons.length;
//        int newSize = currentSize + 1;
//        String[] tempArray = new String[newSize];
//        for (int i = 0; i < currentSize; i++) {
//            tempArray[i] = persons[i];
//        }
//        tempArray[newSize - 1] = newItem;
//        return tempArray;
//
//    }
//
//}
