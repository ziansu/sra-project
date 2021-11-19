@org.junit.Test
public void containsLevel2_jdk_2() throws java.lang.Exception {
    com.logibeat.commons.geography.boundary.GeoDistrictBoundariesCollection collection = com.logibeat.commons.geography.utils.GeoUtils.buildGeoDistrictBoundariesCollection("src/test/resources/data/level/boundaries-level-2-json.zip", GeoPolygon.PipAlgorithm.JDK);
    _task(collection, GeoPolygon.PipAlgorithm.JDK, GeoDistrictLevel.CITY);
}