public static org.phenotips.studies.family.internal2.Pedigree getPedigreeForPatient(org.phenotips.data.Patient patient) {
    org.phenotips.studies.family.Family family = org.phenotips.studies.family.internal.PedigreeUtils.familyRepository.getFamilyForPatient(patient);
    if (family == null) {
        return null;
    }
    return family.getPedigree();
}