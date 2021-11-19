protected javax.ws.rs.client.WebTarget noTimeoutResource() {
    final javax.ws.rs.client.WebTarget target = noTimeoutClient.target(uri);
    if (!(com.google.common.base.Strings.isNullOrEmpty(apiVersion))) {
        return target.path(apiVersion);
    }
    return target;
}