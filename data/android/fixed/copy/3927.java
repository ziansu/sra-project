public void verify(java.lang.String host, javax.net.ssl.SSLSocket ssl) throws java.io.IOException {
    if (!(hostnameverifier.verify(host, ssl.getSession()))) {
        throw new java.io.IOException();
    }
}