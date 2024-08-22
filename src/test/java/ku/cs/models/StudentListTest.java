package ku.cs.models;

import org.junit.jupiter.api.Test;

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

    }

}