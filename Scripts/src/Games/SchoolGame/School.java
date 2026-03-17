package Games.SchoolGame;

import java.util.ArrayList;

import Games.SchoolGame.People.Person;
import Games.SchoolGame.People.Student;
import Games.SchoolGame.People.Teacher;

public class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();
    public School(String name, int numberOfStudents, int numberOfTeachers){
        this.name = name;
        for (int i = 0; i < numberOfStudents; i++){
            students.add(new Student(Person.generateName(),Student.generateGradeLevel()));
        }
        for (int i = 0; i < numberOfTeachers; i++){
            teachers.add(new Teacher(Person.generateName(), Teacher.generateTopic()));
        }
    }
    public void status(){
        System.out.println(name + " Overview: ");
        System.out.println(students.size() + " students in this school");
        System.out.println(teachers.size() + " teachers in this school" + "\n");
        System.out.println(" --- STUDENTS ---");
        for (int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            System.out.println(student.info());
        }
        System.out.println(" --- TEACHERS ---");
        for (int i = 0; i < teachers.size(); i++){
            Teacher teacher = teachers.get(i);
            System.out.println(teacher.info());
        }
    }
}
