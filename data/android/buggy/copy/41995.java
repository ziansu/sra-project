@java.lang.Override
public void resume() {
    if (org.eclipse.jetty.client.http.LOG.isDebugEnabled())
        org.eclipse.jetty.client.http.LOG.debug("Content consumed asynchronously, resuming processing");
    
    process(getResponseBuffer());
}