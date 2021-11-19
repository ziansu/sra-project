public static com.devebot.opflow.OpflowServerlet createServerlet(com.devebot.opflow.OpflowServerlet.ListenerDescriptor listeners) throws com.devebot.opflow.exception.OpflowBootstrapException {
    return com.devebot.opflow.OpflowLoader.createServerlet(null, null, true, listeners);
}