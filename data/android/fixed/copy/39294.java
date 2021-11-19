@java.lang.SuppressWarnings(value = "unchecked")
public <T> T content() {
    return ((T) ((response()) == null ? null : response().content()));
}