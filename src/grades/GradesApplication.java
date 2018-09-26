package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    
    public static void main(String[] args) {
        ArrayList<Integer> grades1 = new ArrayList<>();
        Student student1 = new Student("Hania", grades1);
        student1.addGrade(3);
        student1.addGrade(4);
        student1.addGrade(5);
        
        ArrayList<Integer> grades2 = new ArrayList<>();
        Student student2 = new Student("Bob", grades2);
        student2.addGrade(4);
        student2.addGrade(2);
        student2.addGrade(1);

        ArrayList<Integer> grades3 = new ArrayList<>();
        Student student3 = new Student("Sue", grades3);
        student3.addGrade(5);
        student3.addGrade(6);
        student3.addGrade(1);

        ArrayList<Integer> grades4 = new ArrayList<>();
        Student student4 = new Student("Frank", grades4);
        student3.addGrade(3);
        student3.addGrade(6);
        student3.addGrade(4);
        
        HashMap<String, Student> students = new HashMap<>();

        students.put("HaniaHania", student1);
        students.put("BobBob", student2);
        students.put("SueSue", student3);
        students.put("FrankFrank", student4);

        System.out.println(students.keySet());
        System.out.println(student1.getGradeAverage());
        System.out.println(student1.getName());
        System.out.println(grades1.toString());
        System.out.println(student1.toString());
        

    }
}
