public void setJsonContent(java.lang.String jsonContent) {
    this.jsonContent = jsonContent;
    if ((!(net.jplugin.common.kits.StringKit.isNull(jsonContent))) && (jsonContent.trim().startsWith("{"))) {
        fillItemsToParamContent();
    }
}