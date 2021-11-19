@java.lang.Override
public javax.net.ssl.SSLSocket createSocket() throws java.io.IOException {
    javax.net.ssl.SSLSocket sslSocket = ((javax.net.ssl.SSLSocket) (delegate.createSocket()));
    return configureSocket(sslSocket);
}