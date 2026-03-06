package Homework6.Task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CreateCollection {

               
    public static Set<Student> createStudents() {
        
        Set<Student> students = new HashSet<>();

        Student.Marks marks1 = new Student.Marks(4, 5, 4, 4);
        Student student1 = new Student("Kate", 1, 2, marks1);

        Student.Marks marks2 = new Student.Marks(3, 3, 4, 4);
        Student student2 = new Student("Ivan", 3, 1, marks2);

        Student.Marks marks3 = new Student.Marks(5, 5, 5, 5);
        Student student3 = new Student("Eliza", 2, 3, marks3);

        Student.Marks marks4 = new Student.Marks(3, 3, 2, 3);
        Student student4 = new Student("Max", 1, 2, marks4);
                 

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        return students;

    }

    public static Set<Student> excludeStudent(Set<Student> students) {

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {

            Student student = iterator.next();

            float averageMark = student.getMarks().getAverageMark();

            if (averageMark < 3) {

                iterator.remove();

            }
        }

        return students;

    }

    public static Set<Student> upgradeStudent(Set<Student> students) {

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            
            Student student = iterator.next();

            float averageMark = student.getMarks().getAverageMark();

            if (averageMark >= 3) {

                int newCourse = student.getCourse() + 1;
                student.setCourse(newCourse);

            }
        }

        return students;

    }

     public static void printStudents(Set<Student> students, int course) {

        for (Student student : students) {
            
            if (student.getCourse() == course) {

                System.out.println("Студент: " + student.getName() + " " + student.getCourse() + " курс.");
                
            }
        }
    }
}
    

