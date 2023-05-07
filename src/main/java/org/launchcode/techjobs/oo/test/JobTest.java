package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1,job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        var variable = job1.getId();

        assertTrue(job1.getName()=="Product tester");
        assertTrue(job1.getEmployer().getValue()=="ACME");
        assertTrue(job1.getLocation().getValue()=="Desert");
        assertTrue(job1.getPositionType().getValue()=="Quality control");
        assertTrue(job1.getCoreCompetency().getValue()=="Persistence");

        assertEquals("Product tester",job1.getName());
        assertEquals("ACME",job1.getEmployer().getValue());
        assertEquals("Desert",job1.getLocation().getValue());
        assertEquals("Quality control",job1.getPositionType().getValue());
        assertEquals("Persistence",job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.getId()== job2.getId());
    }


}
