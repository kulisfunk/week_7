package com.example.sandy.overloadingexamples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void testCreateStudent() {
        Student student = new Student(1, "Wilma", 21);
        Student student2 = new Student("Bob");
        Student student3 = new Student();
        assertEquals(1, student.getId());
        assertEquals("Wilma", student.getName());
        assertEquals(21, student.getAge());
        assertEquals("Bob", student2.getName());
        assertEquals(null, student3.getName());
        assertEquals(0, student3.getId());
        assertEquals(0, student3.getAge());
    }
}
