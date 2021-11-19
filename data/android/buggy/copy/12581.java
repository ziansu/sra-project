private void setVoidedObs(org.openmrs.module.emrapi.encounter.domain.EncounterTransaction.Observation observationData, org.openmrs.Obs observation) {
    if (observationData.getVoided()) {
        observation.setVoided(true);
        observation.setVoidReason(observationData.getVoidReason());
    }
}