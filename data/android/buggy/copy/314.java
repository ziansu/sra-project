public boolean disconnectPeer(java.lang.String host) {
    decc.Peer p = pairs.get(host);
    if (p != null)
        deco(p);
    
    return p != null;
}