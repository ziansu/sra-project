@org.junit.Test
public void testNullSubpolygon() throws com.vividsolutions.jts.io.ParseException {
    com.vividsolutions.jts.geom.Geometry geometry = null;
    org.codice.alliance.libs.klv.GeometryReducer reducer = new org.codice.alliance.libs.klv.GeometryReducer();
    com.vividsolutions.jts.geom.Geometry actual = reducer.apply(geometry, context);
    org.junit.Assert.assertThat(actual, org.hamcrest.core.IsNull.nullValue());
}