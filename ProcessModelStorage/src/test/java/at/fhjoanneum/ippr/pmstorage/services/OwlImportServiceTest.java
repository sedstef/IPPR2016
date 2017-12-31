package at.fhjoanneum.ippr.pmstorage.services;

import at.fhjoanneum.ippr.commons.dto.owlimport.jsonimport.ImportProcessModelDTO;
import java.util.Collections;
import java.util.concurrent.Future;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author stefan
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OwlImportServiceTest {

    @Autowired
    private OwlImportService instance;

    public OwlImportServiceTest() {
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

//    /**
//     * Test of getOwlProcessModelDTO method, of class OwlImportService.
//     */
//    @Ignore
//    public void testGetOwlProcessModelDTO() {
//        System.out.println("getOwlProcessModelDTO");
//        String owlContent = "";
//        String version = "";
//        Future<OWLProcessModelDTO> expResult = null;
//        Future<OWLProcessModelDTO> result = instance.getOwlProcessModelDTO(owlContent, version);
//        assertEquals(expResult, result);
//    }

    /**
     * Test of importProcessModel method, of class OwlImportService.
     */
    @Test
    public void testImportProcessModel() throws Exception {
        System.out.println("importProcessModel");
        ImportProcessModelDTO processModelDTO = new ImportProcessModelDTO(
                "Test", 
                "Test", 
                "Test", 
                Collections.emptyList(), 
                Collections.emptyList(), 
                Collections.emptyList(), 
                Collections.emptyList(), 
                Collections.emptyList(), 
                Collections.emptyList(), 
                Collections.emptyList(), 
                0);
        
        Future<Boolean> futureResult = instance.importProcessModel(processModelDTO);
        assertNotNull(futureResult);
//        assertTrue(futureResult.get());
    }

}
