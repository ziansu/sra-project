private org.bouncycastle.crypto.tls.ProtocolVersion getVersionFromString(java.lang.String version) {
    if (version.equals("1.0")) {
        return org.bouncycastle.crypto.tls.ProtocolVersion.DTLSv10;
    }else
        if (version.equals("1.2")) {
            return org.bouncycastle.crypto.tls.ProtocolVersion.DTLSv12;
        }else {
            throw new java.lang.IllegalArgumentException("Invalid DTLS version");
        }
    
}