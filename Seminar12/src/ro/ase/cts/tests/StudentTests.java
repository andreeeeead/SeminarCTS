package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.models.Student;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testConstructorCuParametru() {
        String nume = "gigel";
        Student student = new Student(nume);
        assertEquals("Numele este gresit", nume, student.getNume());
        assertNotNull("Lista nu este initializata", student.getNote());
    }

    @Test
    public void testConstrcutorFaraParametru() {
        Student student = new Student();
        //assertNotEquals(null, student.getNume());
        assertNotNull("Numele este null", student.getNume());
        assertNotNull("Lista nu este initializata", student.getNote());
    }

    @Test
    public void testAdaugaNota() {
        Student student = new Student();
        int nota = 7;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }

    @Test
    public void testDimesniuneLista() {
        Student student = new Student();
        int nota = 7;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }

    @Test
    public void testCalculMedie() {
        Student student = new Student();
        int nota1 = 5;
        int nota2 = 7;
        student.adaugaNota(nota1);
        student.adaugaNota(nota2);
        assertEquals((nota1 + nota2) / 2.0f, student.calculeazaMedie(), 0.001);
    }

    @Test
    public void testAreRestante() {
        Student student = new Student();
        student.adaugaNota(4);
        student.adaugaNota(10);
        //assertEquals(true, student.areRestante());
        assertTrue(student.areRestante());
    }

    @Test
    public void testNuAreRestante() {
        Student student = new Student();
        student.adaugaNota(6);
        student.adaugaNota(10);
        assertFalse(student.areRestante());
    }

    @Test
    public void testSetNume() {
        Student student = new Student();
        String nume = "gigel";
        student.setNume(nume);
        assertEquals(nume, student.getNume());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaAruncaExceptie() {
        Student student = new Student();
        student.getNota(-1);
    }

    @Test
    public void testGetNotaAruncaExceptieJU3() {
        Student student = new Student();
        try {
            student.getNota(-1);
            fail("Metoda nu arunca nicio exceptie");
        } catch (IndexOutOfBoundsException exception) {

        } catch (Exception exception) {
            fail("Metoda nu arunca exceptie de tip IndexOutOfBoundsException");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoteNegative() {
        Student student = new Student();
        student.adaugaNota(-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoteGT10() {
        Student student = new Student();
        student.adaugaNota(20);
    }
}