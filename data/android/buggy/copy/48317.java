@org.junit.Test
@org.junit.experimental.categories.Category(value = org.mrgeo.junit.UnitTest.class)
public void testParseEmpty() throws java.io.IOException {
    org.mrgeo.data.vector.geowave.Map<java.lang.String, java.lang.String> settings = new org.mrgeo.data.vector.geowave.HashMap<java.lang.String, java.lang.String>();
    org.mrgeo.data.vector.geowave.GeoWaveVectorDataProvider.parseDataSourceSettings("", settings);
    org.junit.Assert.assertEquals(0, settings.size());
}