private java.lang.String getInternalId(java.lang.String personID) {
    if (personID.startsWith("orcid.org/")) {
        return personID.substring("orcid.org/".length());
    }else {
        return null;
    }
}