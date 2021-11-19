@tests.service.Test
public void testDeleteAll() throws java.lang.Exception {
    this.genericService.deleteAll();
    java.util.List<T> objects = this.genericService.findAll();
    org.junit.Assert.assertNull(objects);
}