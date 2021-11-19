public void addStreamDefinition(java.lang.String streamDefinitionStr) throws org.wso2.carbon.databridge.commons.exception.MalformedStreamDefinitionException, org.wso2.carbon.databridge.core.exception.StreamDefinitionStoreException {
    org.wso2.carbon.databridge.commons.StreamDefinition streamDefinition = org.wso2.carbon.databridge.commons.utils.EventDefinitionConverterUtils.convertFromJson(streamDefinitionStr);
    getStreamDefinitionStore().saveStreamDefinitionToStore(streamDefinition, (-1));
}