package org.launchcode.techjobs_oo.Test;
import org.junit.Assert;
import org.launchcode.techjobs_oo.*;
import org.testng.annotations.Test;

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        Integer result = job2.getId() - job1.getId();
        Assert.assertFalse(job1.equals(job2));
        Assert.assertEquals(1, result,.001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(job instanceof Job);
        Assert.assertTrue(job.getEmployer() instanceof Employer);
        Assert.assertTrue(job.getLocation() instanceof Location);
        Assert.assertTrue(job.getPositionType() instanceof PositionType);
        Assert.assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertFalse(jobA.equals(jobB));
    }

    @Test
    public void testToStringMethod (){

        Job job = new Job();
        Assert.assertTrue("_" + job.id + "_"
                + job.name + "_"
                + job.employer + "_"
                + job.location + "_"
                + job.positionType + "_"
                + job.coreCompetency + "_");

    }

}
