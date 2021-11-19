public final java.security.cert.Certificate[] getCertificateChain() {
    if ((certChain) == null) {
        return new java.security.cert.Certificate[0];
    }else {
        return java.util.Arrays.copyOf(certChain, certChain.length);
    }
}