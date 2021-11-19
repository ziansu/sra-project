@org.junit.Test(expected = de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException.class)
public void getBoundingBoxOfRangeGivenNegativeRange() throws de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException {
    latitude = 51.9032375;
    longitude = 8.3857535;
    range = -1;
    this.testDocument = de.fh_bielefeld.geograph.API.OSMApi.getBoundingBoxOfRange(latitude, longitude, range);
}