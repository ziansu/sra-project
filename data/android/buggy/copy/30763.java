public void saveData(org.openedit.Data inData, org.openedit.users.User inUser) {
    getXmlUserArchive().saveGroup(((org.openedit.users.Group) (inData)));
    org.openedit.data.PropertyDetails details = getPropertyDetailsArchive().getPropertyDetailsCached(getSearchType());
    updateElasticIndex(details, inData);
}