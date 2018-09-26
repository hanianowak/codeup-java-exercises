
package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
//        grades = new ArrayList<>()
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
//        if (!grades.isEmpty()) {
            for (int grade : this.grades) {
                sum += grade;
            }
            return sum / this.grades.size();
        }
//        return sum;
//    }


//    public static void main(String[] args) {
//        ArrayList<Integer> grades = new ArrayList<>();
//
//        Student student1 = new Student("Hania", grades);
//        student1.addGrade(3);
//        student1.addGrade(5);
//        student1.addGrade(6);
//
//        Student student2 = new Student("Bob", grades);
//        student1.addGrade(3);
//        student1.addGrade(2);
//        student1.addGrade(4);
//
//        Student student3 = new Student("Sue", grades);
//        student1.addGrade(2);
//        student1.addGrade(6);
//        student1.addGrade(3);
//
//        Student student4 = new Student("Frank", grades);
//        student1.addGrade(2);
//        student1.addGrade(3);
//        student1.addGrade(3);
//
//
//        System.out.println(grades);
//        System.out.println(student1.getGradeAverage());
//
//    }
}
