public static com.devebot.opflow.OpflowServerlet createServerlet(java.util.Map<java.lang.String, java.lang.Object> config) throws com.devebot.opflow.exception.OpflowBootstrapException {
    return com.devebot.opflow.OpflowLoader.createServerlet(OpflowServerlet.ListenerDescriptor.EMPTY, config, null, false);
}