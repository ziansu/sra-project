public void restartAllServiceInstances(org.jboss.netty.handler.codec.http.HttpRequest request, co.cask.http.HttpResponder responder, java.lang.String serviceName) {
    restartInstances(responder, serviceName, (-1));
}