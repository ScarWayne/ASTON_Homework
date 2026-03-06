/*
Создайте класс Student, содержащий следующие характеристики – имя, группа, курс, 
оценки по предметам. Создайте коллекцию, содержащую объекты класса Student. 
Следует написать метод, который удаляет студентов со средним баллом < 3, а также отдельный метод, 
который переводит студента на следующий курс, если средний балл >= 3. 
Напишите метод printStudents(Set<Student> students, int course), который получает список студентов 
и номер курса. Метод печатает на консоль имена тех студентов, которые обучаются на данном курсе.
*/

package Homework6.Task1;

import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Student> students = CreateCollection.createStudents();
        students = CreateCollection.excludeStudent(students);
        students = CreateCollection.upgradeStudent(students);


        CreateCollection.printStudents(students, 3);

    }      
     
   
}

