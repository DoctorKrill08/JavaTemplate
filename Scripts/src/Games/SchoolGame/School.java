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
            students.add(Student.generate());
        }
        for (int i = 0; i < numberOfTeachers; i++){
            teachers.add(Teacher.generate());
        }
    }
    public void status(){
        System.out.println(name + " Overview: ");
        System.out.println(students.size() + " students in this school");
        System.out.println(teachers.size() + " teachers in this school" + "\n");
        System.out.println(" --- STUDENTS ---");
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).info());
        }
        System.out.println(" --- TEACHERS ---");
        for (int i = 0; i < teachers.size(); i++){
            System.out.println(teachers.get(i).info());
        }
    }
}
