public org.openlmis.restapi.domain.LatestProgramsWithProducts getLatestProgramsWithProductsByFacilityId(java.lang.Long facilityId, java.util.Date afterUpdatedTime) {
    java.util.List<org.openlmis.restapi.domain.ProgramWithProducts> programsWithProducts = getProgramWithProductsByFacilityIdAndAfterUpdatedTime(facilityId, afterUpdatedTime);
    return new org.openlmis.restapi.domain.LatestProgramsWithProducts(programsWithProducts, new java.util.Date());
}