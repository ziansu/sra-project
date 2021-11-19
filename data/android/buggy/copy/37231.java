public static com.devebot.opflow.OpflowServerlet createServerlet(java.lang.String propFile, com.devebot.opflow.OpflowServerlet.ListenerDescriptor listeners) throws com.devebot.opflow.exception.OpflowBootstrapException {
    return com.devebot.opflow.OpflowLoader.createServerlet(null, propFile, true, listeners);
}