private boolean isClientResource(java.lang.Class<?> clazz) {
    return (clazz != (java.lang.Object.class)) && (com.jaspersoft.jasperserver.dto.resources.ClientResource.class.isAssignableFrom(clazz));
}