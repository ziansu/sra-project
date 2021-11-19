@org.junit.Test
public void contextLoads() {
    java.lang.System.out.println(sampleTableRepo.findAll().size());
    org.junit.Assert.assertEquals(1, sampleTableRepo.findAll().size());
}