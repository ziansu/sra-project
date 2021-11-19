@java.lang.Override
public boolean isSynapseGateway() throws org.wso2.carbon.apimgt.api.APIManagementException {
    org.wso2.carbon.apimgt.impl.APIManagerConfiguration config = org.wso2.carbon.apimgt.impl.internal.ServiceReferenceHolder.getInstance().getAPIManagerConfigurationService().getAPIManagerConfiguration();
    java.lang.String gatewayType = config.getFirstProperty(APIConstants.API_GATEWAY_TYPE);
    return gatewayType.equalsIgnoreCase(APIConstants.API_GATEWAY_TYPE_SYNAPSE);
}