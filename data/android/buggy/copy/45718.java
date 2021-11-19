@org.junit.Test
public void testEmptyProps() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactory dsf = new org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactory();
    java.util.Properties props = new java.util.Properties();
    net.sourceforge.jtds.jdbcx.JtdsDataSource ds = dsf.createDataSource(props);
    org.junit.Assert.assertNotNull(ds);
}