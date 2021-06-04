/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author duarte_martin
 */
@RunWith(Parameterized.class)
public class FechasDuarteParamIT {
    private String fechaEntrada;
    private int resultadoEsperado;

    public FechasDuarteParamIT(String fechaEntrada, int resultadoEsperado) {
        this.fechaEntrada=fechaEntrada;
       this.resultadoEsperado=resultadoEsperado;
    }

    

    @Parameterized.Parameters
    public static Iterable<Object> getData() {
        List<Object> obj = new ArrayList<>();

        obj.add(new Object[]{"2021-06-04", 0});
        obj.add(new Object[]{"2021-06-05", 1});
        obj.add(new Object[]{"2021-06-03", -1});

        return obj;
    }

    /**
     * Test parametrizados
     */
    @Test
    public void testFechaParametrizado() throws Exception {
        System.out.println("la fecha correcta seria:"+fechaEntrada+"la respuesta deberia ser:"
                + resultadoEsperado);
       // String fechaFactura = ""; no nos hace falta
        Fechas instance = new Fechas();
        //int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaEntrada);
        assertEquals(resultadoEsperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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

}
