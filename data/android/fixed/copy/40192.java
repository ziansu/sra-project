@org.junit.Test
public void shouldGetPriceScheduleFullSupplyFacilityApprovedProduct() throws java.lang.Exception {
    repository.getPriceScheduleFullSupplyFacilityApprovedProduct(1L, 2L);
    org.mockito.Mockito.verify(mapper).getPriceScheduleFullSupplyFacilityApprovedProduct(1L, 2L);
}