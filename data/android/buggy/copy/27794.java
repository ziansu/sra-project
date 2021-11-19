@java.lang.Override
public void close() {
    this.httpclient.getConnectionManager().shutdown();
}