package at.fhjoanneum.ippr.processengine.repositories;

import at.fhjoanneum.ippr.persistence.entities.engine.process.ProcessInstanceImpl;
import at.fhjoanneum.ippr.persistence.objects.engine.enums.ProcessInstanceState;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author stefan
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProcessInstanceRepositoryTest {

    @Autowired
    private ProcessInstanceRepository instance;

    public ProcessInstanceRepositoryTest() {
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
     * Test of getProcessesWithState method, of class ProcessInstanceRepository.
     */
    @Test
    public void testGetProcessesWithState() {
        System.out.println("getProcessesWithState");
        String state = "";

        List<ProcessInstanceImpl> result = instance.getProcessesWithState(state);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfProcessesInState method, of class ProcessInstanceRepository.
     */
    @Test
    public void testGetAmountOfProcessesInState() {
        System.out.println("getAmountOfProcessesInState");
        String state = "";

        Long expResult = null;
        Long result = instance.getAmountOfProcessesInState(state);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfProcessesInStatePerUser method, of class ProcessInstanceRepository.
     */
    @Test
    public void testGetAmountOfProcessesInStatePerUser() {
        System.out.println("getAmountOfProcessesInStatePerUser");
        String state = "";
        Long userId = null;

        Long expResult = null;
        Long result = instance.getAmountOfProcessesInStatePerUser(state, userId);
        assertNotNull(result);
    }

    /**
     * Test of getProcessesInfoOfState method, of class ProcessInstanceRepository.
     */
    @Test
    public void testGetProcessesInfoOfState() {
        System.out.println("getProcessesInfoOfState");
        Pageable pageable = null;
        ProcessInstanceState state = null;

        Page<ProcessInstanceImpl> expResult = null;
        Page<ProcessInstanceImpl> result = instance.getProcessesInfoOfState(pageable, state);
        assertNotNull(result);
    }

    /**
     * Test of getProcessesInfoOfUserAndState method, of class ProcessInstanceRepository.
     */
    @Test
    public void testGetProcessesInfoOfUserAndState() {
        System.out.println("getProcessesInfoOfUserAndState");
        Pageable pageable = null;
        Long user = null;
        ProcessInstanceState state = null;

        Page<ProcessInstanceImpl> expResult = null;
        Page<ProcessInstanceImpl> result = instance.getProcessesInfoOfUserAndState(pageable, user, state);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfStartedProcessesBetweenRange method, of class ProcessInstanceRepository.
     */
    @Test
    public void testGetAmountOfStartedProcessesBetweenRange() {
        System.out.println("getAmountOfStartedProcessesBetweenRange");
        LocalDateTime start = null;
        LocalDateTime end = null;

        Long expResult = null;
        Long result = instance.getAmountOfStartedProcessesBetweenRange(start, end);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfFinishedProcessesBetweenRange method, of class ProcessInstanceRepository.
     */
    @Test
    public void testGetAmountOfFinishedProcessesBetweenRange() {
        System.out.println("getAmountOfFinishedProcessesBetweenRange");
        LocalDateTime start = null;
        LocalDateTime end = null;

        Long expResult = null;
        Long result = instance.getAmountOfFinishedProcessesBetweenRange(start, end);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfStartedProcessesBetweenRangeForUser method, of class ProcessInstanceRepository.
     */
    @Test
    public void testGetAmountOfStartedProcessesBetweenRangeForUser() {
        System.out.println("getAmountOfStartedProcessesBetweenRangeForUser");
        LocalDateTime start = null;
        LocalDateTime end = null;
        Long userId = null;

        Long expResult = null;
        Long result = instance.getAmountOfStartedProcessesBetweenRangeForUser(start, end, userId);
        assertNotNull(result);
    }

    /**
     * Test of getAmountOfFinishedProcessesBetweenRangeForUser method, of class ProcessInstanceRepository.
     */
    @Test
    public void testGetAmountOfFinishedProcessesBetweenRangeForUser() {
        System.out.println("getAmountOfFinishedProcessesBetweenRangeForUser");
        LocalDateTime start = null;
        LocalDateTime end = null;
        Long userId = null;

        Long expResult = null;
        Long result = instance.getAmountOfFinishedProcessesBetweenRangeForUser(start, end, userId);
        assertNotNull(result);
    }

}
