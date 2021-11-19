@java.lang.Override
public boolean f(final com.google.gwt.user.client.Event e) {
    e.stopPropagation();
    this.defaultAction.execute();
    return false;
}