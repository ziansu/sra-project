public com.jaspersoft.jasperserver.jaxrs.client.core.operationresult.OperationResult<org.codehaus.jettison.json.JSONObject> bundle(java.lang.String name) {
    return buildBundleRequest("/bundles", name).get();
}