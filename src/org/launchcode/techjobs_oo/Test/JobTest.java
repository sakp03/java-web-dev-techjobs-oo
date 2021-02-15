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
    public void testToStringWithLabel(){
        Job job = new Job("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = String.format("\nID: %d\n" +
                "Name: %s\n" +
                "Employer: %s\n" +
                "Location: %s\n" +
                "Position Type: %s\n" +
                "Core Competency: %s\n", job.getId(), job.getName(), job.getEmployer().setValue("Data not available"), job.getLocation().setValue("Data not available"), job.getPositionType(), job.getCoreCompetency());

        String output = job.toString();

        Assert.assertEquals(jobString, output);

    }

}
