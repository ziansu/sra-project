@java.lang.Override
public void removeLexicalClassIdentity(java.lang.Long lexicalClassIdentityId) throws java.lang.Exception {
    org.apache.log4j.Logger.getLogger(getClass()).debug(("Umls Identity Service - remove lexicalClass identity " + lexicalClassIdentityId));
    com.wci.umls.server.model.meta.LexicalClassIdentity identity = getLexicalClassIdentity(lexicalClassIdentityId);
    removeObject(identity);
}