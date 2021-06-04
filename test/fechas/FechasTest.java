/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duarte_martin
 */
public class FechasTest {
    
    public FechasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
    @Test
    public void testEsFacturaCorrectaEnFecha() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "";
        Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
