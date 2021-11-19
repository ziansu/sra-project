@java.lang.Override
public boolean handles(java.net.URI location) {
    if ((location.getScheme()) == null) {
        return true;
    }
    return java.util.Objects.equals(getScheme(), equals(this.AnonymousScheme));
}