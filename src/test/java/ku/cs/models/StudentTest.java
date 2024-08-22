package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init() {
        s1 = new Student("6610401918" , "Mig" ,90);
    }
    @Test
    void testAddScore() {
        assertEquals(90 , s1.getScore());
        s1.addScore(10);
        assertEquals(100 , s1.getScore());
    }

    @Test
    void testCalculateGrade() {
        s1.addScore(10);
        assertEquals("A" , s1.grade() );
    }

    @Test
    void testChangeName(){
        Student s1 = new Student("6610401918", "Mig");
        s1.changeName("mig");
        assertEquals("mig", s1.getName());
    }

    @Test
    void testIsId(){
        Student s1 = new Student("6610401918", "Mig");
        s1.isId("6610401918");
        assertEquals("6610401918", s1.getId());
    }
}