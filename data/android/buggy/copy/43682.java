private boolean isRemote(java.lang.Object url) {
    if (url instanceof java.lang.String) {
        return com.truckmovers.cordova.RemoteInjectionPlugin.REMOTE_URL_REGEX.matcher(((java.lang.String) (url))).matches();
    }
    return false;
}