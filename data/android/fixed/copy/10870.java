public java.lang.String getPartnerPersonInstitution(int idProjectPartnerPerson) {
    if (idProjectPartnerPerson < (this.listMapPartnerPersons.size())) {
        return listMapPartnerPersons.get((idProjectPartnerPerson - 1)).get("institution_name");
    }
    return null;
}