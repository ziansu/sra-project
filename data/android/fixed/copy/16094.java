void init(@javax.enterprise.event.Observes
@javax.enterprise.context.Initialized(value = javax.enterprise.context.ApplicationScoped.class)
java.lang.Object obj) {
    LOGGER.info(("Starting webserver on " + (getMachineURL())));
    if (isSecuredConfigured()) {
        LOGGER.info(("Running securely on " + (getSecureURL())));
    }
}