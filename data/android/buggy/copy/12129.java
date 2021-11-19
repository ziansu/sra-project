@javax.enterprise.inject.Produces
@javax.enterprise.inject.Default
public org.commonjava.indy.model.core.io.IndyObjectMapper getIndyObjectMapper() {
    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
    logger.info("Core mapper is: {}", objectMapper);
    return objectMapper;
}