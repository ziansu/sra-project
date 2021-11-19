@org.junit.Test(expected = de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException.class)
public void getBoundingBoxOfRangeGivenNegativeRange() throws de.fh_bielefeld.geograph.API.Exception.InvalidAPIRequestException {
    this.latitude = 51.9032375;
    this.longitude = 8.3857535;
    this.range = -1;
    this.testDocument = de.fh_bielefeld.geograph.API.OSMApi.getBoundingBoxOfRange(latitude, longitude, range);
}