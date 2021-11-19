@javax.transaction.Transactional
public com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAssignment saveHousingUnitAssignment(com.hserv.coordinatedentry.housinginventory.domain.HousingUnitAssignment housingUnitAssignments) {
    housingUnitAssignments.setAssignmentId(java.util.UUID.randomUUID());
    housingUnitAssignments = housingUnitAssignmentRepository.save(housingUnitAssignments);
    return housingUnitAssignments;
}