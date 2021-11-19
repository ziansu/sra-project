public java.util.List<java.util.Map<java.lang.String, java.lang.String>> getDistributedFacilities(java.lang.Long periodId, java.lang.Long facilityId, org.openlmis.core.domain.Pagination pagination) {
    return repository.getDistributedFacilities(periodId, facilityId, pagination);
}