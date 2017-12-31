package at.fhjoanneum.ippr.processengine.services;

import at.fhjoanneum.ippr.commons.dto.processengine.ProcessInfoDTO;
import at.fhjoanneum.ippr.commons.dto.processengine.ProcessStartDTO;
import at.fhjoanneum.ippr.commons.dto.processengine.ProcessStartedDTO;
import at.fhjoanneum.ippr.commons.dto.processengine.ProcessStateDTO;
import at.fhjoanneum.ippr.commons.dto.processengine.TaskDTO;
import at.fhjoanneum.ippr.commons.dto.processengine.stateobject.StateObjectChangeDTO;
import at.fhjoanneum.ippr.commons.dto.processengine.stateobject.StateObjectDTO;
import java.time.LocalDateTime;
import java.util.List;
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
public class ProcessServiceTest {

    @Autowired
    private ProcessService instance;

    public ProcessServiceTest() {
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
     * Test of startProcess method, of class ProcessService.
     */
    @Test
    public void testStartProcess() {
        System.out.println("startProcess");
        ProcessStartDTO processStartDTO = null;

        Future<ProcessStartedDTO> expResult = null;
        Future<ProcessStartedDTO> result = instance.startProcess(processStartDTO);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfProcessesInState method, of class ProcessService.
     */
    @Test
    public void testGetAmountOfProcessesInState() {
        System.out.println("getAmountOfProcessesInState");
        String state = "";

        Future<Long> expResult = null;
        Future<Long> result = instance.getAmountOfProcessesInState(state);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfProcessesInStatePerUser method, of class ProcessService.
     */
    @Test
    public void testGetAmountOfProcessesInStatePerUser() {
        System.out.println("getAmountOfProcessesInStatePerUser");
        String state = "";
        Long userId = null;

        Future<Long> expResult = null;
        Future<Long> result = instance.getAmountOfProcessesInStatePerUser(state, userId);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfStartedProcessesBetween method, of class ProcessService.
     */
    @Test
    public void testGetAmountOfStartedProcessesBetween() {
        System.out.println("getAmountOfStartedProcessesBetween");
        LocalDateTime start = null;
        LocalDateTime end = null;

        Future<Long> expResult = null;
        Future<Long> result = instance.getAmountOfStartedProcessesBetween(start, end);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfStartedProcessesBetweenForUser method, of class ProcessService.
     */
    @Test
    public void testGetAmountOfStartedProcessesBetweenForUser() {
        System.out.println("getAmountOfStartedProcessesBetweenForUser");
        LocalDateTime start = null;
        LocalDateTime end = null;
        Long userId = null;

        Future<Long> expResult = null;
        Future<Long> result = instance.getAmountOfStartedProcessesBetweenForUser(start, end, userId);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfFinishedProcessesBetween method, of class ProcessService.
     */
    @Test
    public void testGetAmountOfFinishedProcessesBetween() {
        System.out.println("getAmountOfFinishedProcessesBetween");
        LocalDateTime start = null;
        LocalDateTime end = null;

        Future<Long> expResult = null;
        Future<Long> result = instance.getAmountOfFinishedProcessesBetween(start, end);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfFinishedProcessesBetweenForUser method, of class ProcessService.
     */
    @Test
    public void testGetAmountOfFinishedProcessesBetweenForUser() {
        System.out.println("getAmountOfFinishedProcessesBetweenForUser");
        LocalDateTime start = null;
        LocalDateTime end = null;
        Long userId = null;

        Future<Long> expResult = null;
        Future<Long> result = instance.getAmountOfFinishedProcessesBetweenForUser(start, end, userId);
        assertNotNull(result);
    }

    /**
     * Test of getStateOfProcessInstance method, of class ProcessService.
     */
    @Test
    public void testGetStateOfProcessInstance() {
        System.out.println("getStateOfProcessInstance");
        Long piId = null;

        Future<ProcessStateDTO> expResult = null;
        Future<ProcessStateDTO> result = instance.getStateOfProcessInstance(piId);
        assertNotNull(result);
    }

    /**
     * Test of getProcessesInfoOfState method, of class ProcessService.
     */
    @Test
    public void testGetProcessesInfoOfState() {
        System.out.println("getProcessesInfoOfState");
        String state = "";
        int page = 0;
        int size = 0;

        Future<List<ProcessInfoDTO>> expResult = null;
        Future<List<ProcessInfoDTO>> result = instance.getProcessesInfoOfState(state, page, size);
        assertNotNull(result);
    }

    /**
     * Test of getProcessesInfoOfUserAndState method, of class ProcessService.
     */
    @Test
    public void testGetProcessesInfoOfUserAndState() {
        System.out.println("getProcessesInfoOfUserAndState");
        Long user = null;
        String state = "";
        int page = 0;
        int size = 0;

        Future<List<ProcessInfoDTO>> expResult = null;
        Future<List<ProcessInfoDTO>> result = instance.getProcessesInfoOfUserAndState(user, state, page, size);
        assertNotNull(result);
    }

    /**
     * Test of stopProcess method, of class ProcessService.
     */
    @Test
    public void testStopProcess() {
        System.out.println("stopProcess");
        Long piId = null;

        Future<ProcessInfoDTO> expResult = null;
        Future<ProcessInfoDTO> result = instance.stopProcess(piId);
        assertNotNull(result);
    }

    /**
     * Test of getTasksOfUser method, of class ProcessService.
     */
    @Test
    public void testGetTasksOfUser() {
        System.out.println("getTasksOfUser");
        Long userId = null;

        Future<List<TaskDTO>> expResult = null;
        Future<List<TaskDTO>> result = instance.getTasksOfUser(userId);
        assertNotNull(result);
    }

    /**
     * Test of getStateObjectOfUserInProcess method, of class ProcessService.
     */
    @Test
    public void testGetStateObjectOfUserInProcess() {
        System.out.println("getStateObjectOfUserInProcess");
        Long piId = null;
        Long userId = null;

        Future<StateObjectDTO> expResult = null;
        Future<StateObjectDTO> result = instance.getStateObjectOfUserInProcess(piId, userId);
        assertNotNull(result);
    }

    /**
     * Test of changeStateOfUserInProcess method, of class ProcessService.
     */
    @Test
    public void testChangeStateOfUserInProcess() {
        System.out.println("changeStateOfUserInProcess");
        Long piId = null;
        Long userId = null;
        StateObjectChangeDTO stateObjectChangeDTO = null;

        Future<Boolean> expResult = null;
        Future<Boolean> result = instance.changeStateOfUserInProcess(piId, userId, stateObjectChangeDTO);
        assertNotNull(result);
    }

}
