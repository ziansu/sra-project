@org.junit.After
public void cleanUp() {
    facilityRepository.deleteAll();
    programRepository.deleteAll();
    geographicZoneRepository.deleteAll();
    geographicLevelRepository.deleteAll();
    facilityTypeRepository.deleteAll();
    repository.deleteAll();
}