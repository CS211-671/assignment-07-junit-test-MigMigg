package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init() {
        s1 = new Student("6610401918" , "Mig" ,90);
    }
    @Test
    @DisplayName("Test Add Student Score")
    void testAddScore() {
        assertEquals(90 , s1.getScore());
        s1.addScore(10);
        assertEquals(100 , s1.getScore());
    }

    @Test
    @DisplayName("Test Calculate Student Grade")
    void testCalculateGrade() {
        s1.addScore(10);
        assertEquals("A" , s1.grade() );
    }

    @Test
    @DisplayName("Test Change Student Name")
    void testChangeName(){
        s1.changeName("mig");
        assertEquals("mig", s1.getName());
    }

    @Test
    @DisplayName("Test Is ID")
    void testIsId(){
        assertTrue( s1.isId("6610401918") );
    }
    @Test
    @DisplayName("Test Get Student ID")
    void testGetId() {
        assertEquals("6610401918", s1.getId());
    }
    @Test
    @DisplayName("Test Get Student Name")
    void testGetName() {
        assertEquals("Mig", s1.getName());
    }
    @Test
    @DisplayName("Test Get Student Score")
    void testGetScore() {
        assertEquals(90, s1.getScore());
    }
}