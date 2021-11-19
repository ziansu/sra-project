public java.lang.String net_version() {
    java.lang.String s = null;
    try {
        return s = eth_protocolVersion();
    } finally {
        if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
            org.ethereum.jsonrpc.JsonRpcImpl.logger.debug(("net_version(): " + s));
        
    }
}