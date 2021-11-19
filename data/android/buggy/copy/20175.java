@org.junit.Test(expected = de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException.class)
public void getBoundingBoxOfRangeGivenWrongLongitude() throws de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException {
    latitude = 51.9032375;
    longitude = 181;
    range = 0.1;
    this.testDocument = de.fh_bielefeld.geograph.API.OSMApi.getBoundingBoxOfRange(latitude, longitude, range);
}