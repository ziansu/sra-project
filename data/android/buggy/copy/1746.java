public static com.devebot.opflow.OpflowServerlet createServerlet(java.util.Map<java.lang.String, java.lang.Object> config, com.devebot.opflow.OpflowServerlet.ListenerDescriptor listeners) throws com.devebot.opflow.exception.OpflowBootstrapException {
    return com.devebot.opflow.OpflowLoader.createServerlet(config, null, false, listeners);
}