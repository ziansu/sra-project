@org.junit.Test
public void testFieldBeanWithNoValue() {
    java.lang.String value = null;
    de.tblsoft.solr.pipeline.bean.Field f = new de.tblsoft.solr.pipeline.bean.Field("foo", value);
    f.setValues(new java.util.ArrayList<java.lang.String>());
    org.junit.Assert.assertNull(f.getValue());
}