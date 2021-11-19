@java.lang.Override
public void close() throws nz.ac.auckland.scriptella.driver.http.ProviderException {
    if ((httpGet) != null) {
        httpGet.releaseConnection();
    }else
        if ((httpRequestBase) != null) {
            httpRequestBase.releaseConnection();
        }
    
}