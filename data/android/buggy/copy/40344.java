protected org.cometd.oort.OortComet findComet(java.lang.String cometURL) {
    org.cometd.oort.OortComet result = getComet(cometURL);
    if (result == null)
        result = _pendingComets.get(cometURL);
    
    return result;
}