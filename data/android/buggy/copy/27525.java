@javax.enterprise.inject.Produces
public org.slf4j.Logger createLogger(final javax.enterprise.inject.spi.InjectionPoint injectionPoint) {
    java.lang.Class<?> clazz = injectionPoint.getMember().getDeclaringClass();
    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(clazz);
    return logger;
}