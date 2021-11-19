public java.util.List<org.openlmis.restapi.domain.ProgramWithProducts> getLatestProgramsWithProductsByFacilityId(java.lang.Long facilityId, java.util.Date afterUpdatedTime) {
    return getProgramWithProductsByFacilityIdAndAfterUpdatedTime(facilityId, afterUpdatedTime);
}