@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void createFirmwareLocationWithNullDomain() {
    new com.alliander.osgp.domain.core.valueobjects.FirmwareLocation(null, "/firmware");
}