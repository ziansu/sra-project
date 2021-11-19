@org.junit.Test
public void simpleSearch() throws java.lang.Throwable {
    java.util.List<gadget.component.job.owm.data.City> result = client.searchCity(null);
    org.junit.Assert.assertNotNull(result);
    org.junit.Assert.assertEquals(10, result.size());
}