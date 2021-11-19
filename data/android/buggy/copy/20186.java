@org.junit.Test
public void shouldGetAllFacilities() {
    facilityService.facilities();
    org.mockito.Mockito.verify(mockAllFacilities).facilities();
}