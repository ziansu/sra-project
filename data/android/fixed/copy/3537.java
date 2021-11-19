@org.junit.Test(expected = de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException.class)
public void getBoundinBoxLatLongGivenTwoSameCoordinates() throws de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException {
    this.latitude = 52.520007;
    this.longitude = 13.204953999999976;
    this.testDocument = de.fh_bielefeld.geograph.API.OSMApi.getBoundingBoxLatLong(latitude, longitude, latitude, longitude);
}