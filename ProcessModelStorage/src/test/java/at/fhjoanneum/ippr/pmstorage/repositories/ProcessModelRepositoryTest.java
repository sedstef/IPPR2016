package at.fhjoanneum.ippr.pmstorage.repositories;

import at.fhjoanneum.ippr.persistence.entities.model.process.ProcessModelImpl;
import java.util.List;
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
public class ProcessModelRepositoryTest {

    @Autowired
    private ProcessModelRepository instance;

    public ProcessModelRepositoryTest() {
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
     * Test of findActiveProcesses method, of class ProcessModelRepository.
     */
    @Test
    public void testFindActiveProcesses() {
        System.out.println("findActiveProcesses");

        List<ProcessModelImpl> result = instance.findActiveProcesses();
        assertNotNull(result);
    }

//    /**
//     * Test of findActiveProcessesToStart method, of class ProcessModelRepository.
//     */
//    @Test
//    public void testFindActiveProcessesToStart() {
//        System.out.println("findActiveProcessesToStart");
//        List<String> rules = null;
//        
//        List<ProcessModelImpl> expResult = null;
//        List<ProcessModelImpl> result = instance.findActiveProcessesToStart(rules);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of findAllOrderedByName method, of class ProcessModelRepository.
//     */
//    @Test
//    public void testFindAllOrderedByName() {
//        System.out.println("findAllOrderedByName");
//        
//        List<ProcessModelImpl> expResult = null;
//        List<ProcessModelImpl> result = instance.findAllOrderedByName();
//        assertEquals(expResult, result);
//    }
}
