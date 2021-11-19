@java.lang.SuppressWarnings(value = "unchecked")
public static java.lang.String entityName(org.lightadmin.core.config.domain.DomainTypeAdministrationConfiguration domainTypeAdministrationConfiguration, java.lang.Object entity) {
    final org.lightadmin.api.config.utils.EntityNameExtractor nameExtractor = domainTypeAdministrationConfiguration.getEntityConfiguration().getNameExtractor();
    return org.lightadmin.core.config.domain.configuration.support.ExceptionAwareTransformer.exceptionAwareNameExtractor(nameExtractor, domainTypeAdministrationConfiguration).apply(entity).toString();
}