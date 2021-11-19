@java.lang.Override
public void sessionCreated(javax.servlet.http.HttpSessionEvent sessionEvent) {
    com.canoo.dolphin.util.Assert.requireNonNull(sessionEvent, "sessionEvent");
    try {
        sessionEvent.getSession().setMaxInactiveInterval(sessionTimeoutInSeconds);
    } catch (java.lang.Exception e) {
        com.canoo.dolphin.server.context.DolphinHttpSessionListener.LOG.warn("Can not set the defined session timeout!");
    }
}