package ro.ase.cts.tests;

import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class GrupaFictureTest {
    Grupa grupa;

    @Before
    public void setUp() throws Exception {
        this.grupa=new Grupa(1078);
        for(int i=0;i<35;i++) {
            Student student=new Student();
            for(int j=0;j<7;j++) {
                student.adaugaNota(9);
            }
            grupa.adaugaStudent(student);
        }
    }

    @Test(timeout=500)
    public void testGetPromovabilitatePerformance() {
        grupa.getPromovabilitate();
    }
}