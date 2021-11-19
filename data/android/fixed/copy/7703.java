private boolean isPermissionRequest(final java.lang.String path, final java.lang.String httpMethod) {
    return ((path != null) && (path.startsWith(JaxrsResource.SECURITY_PATH))) && ("GET".equals(httpMethod));
}