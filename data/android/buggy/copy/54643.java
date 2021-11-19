public org.nuxeo.ecm.core.api.DocumentModel getDocModelForRefName(org.collectionspace.services.nuxeo.client.java.CoreSessionInterface repoSession, java.lang.String refName) throws java.lang.Exception, org.collectionspace.services.common.document.DocumentNotFoundException {
    return getDocModelForAuthorityItem(repoSession, RefName.AuthorityItem.parse(refName));
}