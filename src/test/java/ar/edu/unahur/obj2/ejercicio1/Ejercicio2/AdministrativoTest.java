package ar.edu.unahur.obj2.ejercicio1.Ejercicio2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdministrativoTest {
    @BeforeMethod
    public void setUp() {
        Administrativo adm1 = new Administrativo("99999999", "Juan", "perez", "juanperez@yagoo.com.ar", 10000 ,"asd123", 20, 200);
    }

    @Test
    public void testName() {
        Administrativo adm1 = new Administrativo("99999999", "Juan", "perez", "juanperez@yagoo.com.ar", 10000 ,"asd123", 20, 200);
        Administrativo adm2 = new Administrativo("99999999", "Juan", "perez", "juanperez@yagoo.com.ar", 10000 ,"asd123", 20, 200);

        assertTrue (adm1.equals(adm2));
    }
}