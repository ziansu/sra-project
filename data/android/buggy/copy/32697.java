public gov.adlnet.xapi.model.StatementResult getStatements(java.lang.String more) throws java.io.IOException {
    java.lang.String result = this.issueGet(more);
    return this.getDecoder().fromJson(result, gov.adlnet.xapi.model.StatementResult.class);
}