@java.lang.Override
public javax.ws.rs.core.Response viewWorkCitation(java.lang.String orcid, java.lang.Long putCode) {
    return downgradeAndValidateResponse(publicV2ApiServiceDelegator.viewWorkCitation(orcid, putCode), orcid);
}