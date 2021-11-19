protected void setFaultPayload(org.apache.synapse.MessageContext messageContext, java.lang.String errorMessage, java.lang.String errorDescription) {
    org.wso2.carbon.apimgt.gateway.handlers.Utils.setSOAPFault(messageContext, "Server", errorMessage, errorDescription);
}