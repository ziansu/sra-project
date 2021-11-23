private boolean isClientResource(java.lang.Class<?> clazz) {
    return (clazz != (java.lang.Object.class)) && (clazz.isAssignableFrom(com.jaspersoft.jasperserver.dto.resources.ClientResource.class));
}