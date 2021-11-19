public void restoreBinding(final java.lang.String bindingKey, final org.wso2.andes.server.queue.AMQQueue queue, final org.wso2.andes.server.exchange.Exchange exchange, final java.util.Map<java.lang.String, java.lang.Object> argumentMap) throws org.wso2.andes.AMQInternalException, org.wso2.andes.AMQSecurityException {
    makeBinding(bindingKey, queue, exchange, argumentMap, true, false);
}