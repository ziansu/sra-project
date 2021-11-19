@org.junit.Test
public void testDriver() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactory dsf = new org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactory();
    java.util.Properties props = testProps();
    net.sourceforge.jtds.jdbc.Driver driver = dsf.createDriver(props);
    org.junit.Assert.assertNotNull(driver);
}