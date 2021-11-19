@org.junit.Test
public void testRead() {
    org.junit.Assert.assertEquals(tema, temaDao.read(tema.getId()));
}