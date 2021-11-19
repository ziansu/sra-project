@java.lang.Override
public boolean shouldRedirect(java.net.URI uri) {
    return ((uri.getHost()) != null) && (uri.getHost().equalsIgnoreCase(this.from));
}