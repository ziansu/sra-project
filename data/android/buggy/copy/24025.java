public boolean isInRange(com.intelliment.entity.Protocol requestProtocol) {
    return (isAnyProtocol()) || ((matchProtocols(requestProtocol)) && (matchAllPorts(requestProtocol)));
}