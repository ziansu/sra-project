private java.lang.String processMessageId(java.lang.String messageId) {
    if (messageId == null) {
        java.lang.String id = com.pkrete.xrd4j.common.util.MessageHelper.generateId();
        com.pkrete.restgateway.ConsumerGateway.logger.debug("\"{}\" header is null. Use auto-generated id \"{}\" instead.", Constants.XRD_HEADER_MESSAGE_ID, id);
        return id;
    }
    return messageId;
}