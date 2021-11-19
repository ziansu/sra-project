public boolean isLocalHost(final javax.servlet.ServletRequest request) {
    return ((settings.getString(net.trajano.sonar.plugins.reverseproxyauth.ReverseProxyAuthSettings.LOCALHOST)) != null) && (settings.getString(net.trajano.sonar.plugins.reverseproxyauth.ReverseProxyAuthSettings.LOCALHOST).equals(request.getServerName()));
}