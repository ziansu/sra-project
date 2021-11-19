@javax.annotation.PostConstruct
public void logPort() {
    LOGGER.info(("Starting webserver on " + (getMachineURL())));
    if (isSecuredConfigured()) {
        LOGGER.info(("Running securely on " + (getSecureURL())));
    }
}