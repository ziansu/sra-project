public void debug(java.lang.String msg) {
    if (org.jboss.reddeer.common.context.ExecutionSetting.getInstance().isDebugEnabled()) {
        print(org.jboss.reddeer.common.logging.Logger.debug, msg, MessageType.DEBUG);
    }
}