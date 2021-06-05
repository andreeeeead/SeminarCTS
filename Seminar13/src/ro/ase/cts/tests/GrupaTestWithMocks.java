package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mocks.StudentDummy;
import ro.ase.cts.mocks.StudentFake;
import ro.ase.cts.mocks.StudentStub;

import static org.junit.Assert.*;

public class GrupaTestWithMocks {
    @Test
    public void testAdaugareStudentWithDummy() {
        StudentDummy studentDummy = new StudentDummy();
        Grupa grupa = new Grupa(1078);
        grupa.adaugaStudent(studentDummy);
        assertEquals(1, grupa.getStudenti().size());
    }

    @Test
    public void testGetPromovabilitateWithStub() {
        StudentStub studentStub = new StudentStub();
        Grupa grupa = new Grupa(1078);
        grupa.adaugaStudent(studentStub);
        assertEquals(0, grupa.getPromovabilitate(), 0.001);
    }

    @Test
    public void testGetPromovabilitateWithFake() {
        Grupa grupa = new Grupa(1078);
        for(int i=0;i<7;i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestante(false);
            grupa.adaugaStudent(studentFake);
        }
        for(int i=0;i<3;i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestante(true);
            grupa.adaugaStudent(studentFake);
        }
        assertEquals(0.7, grupa.getPromovabilitate(), 0.0001);
    }
}