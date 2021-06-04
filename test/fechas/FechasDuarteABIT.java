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
public class FechasDuarteABIT {
    
    private  Fechas instance;
    
    
    public FechasDuarteABIT() {
    }
    
    
    @Before
    public void setUp() {
        System.out.println("declaramos la instancia para ejecutar los test");
        instance= new Fechas(); 
    }
    
    @After
    public void tearDown() {
        System.out.println("eliminamos la instancia");
        instance=null;
    }

    @Test
    public void testFecha1_1() throws Exception {
        System.out.println("Caso 1.1: Datos de entrada: Fecha de hoy (Valor borde). Resultado\n" +
"      esperado (Salida): Se permite el ingreso de la transacción\n" +
"      (éxito).");
        String fechaFactura = "2021-06-04";
        //Fechas instance = new Fechas();  no nos hara falta
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testFecha1_2() throws Exception {
        System.out.println("Caso 1.2: Datos de entrada: Fecha de hoy más un día (Fecha de mañana).\n" +
"      Resultado esperado (Salida): No se permite el ingreso de la transacción y\n" +
"      se muestra un mensaje de error." +
"      (éxito).");
        String fechaFactura = "2021-06-05";
        //Fechas instance = new Fechas();    no nos hara falta
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testFecha1_3() throws Exception {
        System.out.println("Caso 1.3: Datos de entrada: Fecha del día de ayer. Resultado esperado\n" +
"      (Salida): Se permite el ingreso de la transacción (éxito).");
        String fechaFactura = "2021-06-03";
        //Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
