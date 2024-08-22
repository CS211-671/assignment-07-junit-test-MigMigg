package ku.cs.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    void testAddNewStudentByIdAndName(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610401918", "Mig");
        Student student = studentList.findStudentById("6610401918");
        assertEquals("Mig", student.getName());
    }

    @Test
    void testAddNewStudentByIdNameAndScore(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610401918", "Mig" , 80);
        Student student = studentList.findStudentById("6610401918");
        assertEquals(80, student.getScore());
    }
    @Test
    void testFindStudentById(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610401918", "Mig");
        assertEquals("Mig", studentList.findStudentById("6610401918").getName() );
    }
    @Test
    void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610401918", "Mig");
        studentList.giveScoreToId("6610401918",80);
        assertEquals(80, studentList.findStudentById("6610401918").getScore());
    }
    @Test
    void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610401918", "Mig" , 80);
        assertEquals("A" ,studentList.viewGradeOfId("6610401918"));
    }
    @Test
    void testGetStudents() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("6610401918", "Mig");
        assertEquals( studentList.getStudents().get(0),studentList.findStudentById("6610401918") );
    }

}