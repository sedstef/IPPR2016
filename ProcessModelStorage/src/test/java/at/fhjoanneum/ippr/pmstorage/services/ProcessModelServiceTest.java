package at.fhjoanneum.ippr.pmstorage.services;

import at.fhjoanneum.ippr.commons.dto.pmstorage.ProcessModelDTO;
import java.util.List;
import java.util.concurrent.Future;
import org.junit.After;
import org.junit.Before;
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
public class ProcessModelServiceTest {

    @Autowired
    private ProcessModelService instance;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
//
//    /**
//     * Test of findActiveProcessModels method, of class ProcessModelServiceImpl.
//     */
//    @Test
//    public void testFindActiveProcessModels() {
//        System.out.println("findActiveProcessModels");
//        Pageable pageable = null;
//        
//        Future<List<ProcessModelDTO>> expResult = null;
//        Future<List<ProcessModelDTO>> result = instance.findActiveProcessModels(pageable);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of findActiveProcessModelsToStart method, of class ProcessModelServiceImpl.
//     */
//    @Test
//    public void testFindActiveProcessModelsToStart() {
//        System.out.println("findActiveProcessModelsToStart");
//        List<String> rules = null;
//        Pageable pageable = null;
//        
//        Future<List<ProcessModelDTO>> expResult = null;
//        Future<List<ProcessModelDTO>> result = instance.findActiveProcessModelsToStart(rules, pageable);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getFieldTypes method, of class ProcessModelServiceImpl.
//     */
//    @Test
//    public void testGetFieldTypes() {
//        System.out.println("getFieldTypes");
//        
//        Future<List<FieldTypeDTO>> expResult = null;
//        Future<List<FieldTypeDTO>> result = instance.getFieldTypes();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getPermissions method, of class ProcessModelServiceImpl.
//     */
//    @Test
//    public void testGetPermissions() {
//        System.out.println("getPermissions");
//        
//        Future<List<FieldPermissionDTO>> expResult = null;
//        Future<List<FieldPermissionDTO>> result = instance.getPermissions();
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of disableProcessModel method, of class ProcessModelServiceImpl.
//     */
//    @Test
//    public void testDisableProcessModel() {
//        System.out.println("disableProcessModel");
//        Long pmId = null;
//        
//        instance.disableProcessModel(pmId);
//    }

    /**
     * Test of findAllProcessModels method, of class ProcessModelServiceImpl.
     */
    @Test
    public void testFindAllProcessModels() throws Exception {
        System.out.println("findAllProcessModels");

        Future<List<ProcessModelDTO>> futureResult = instance.findAllProcessModels();
        assertNotNull(futureResult);
        List<ProcessModelDTO> result = futureResult.get();
        assertNotNull(result);
    }

}
