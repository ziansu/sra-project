@java.lang.Override
public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent<java.util.List<org.roda.core.data.v2.user.Group>> event) {
    updatePermissions(event.getValue());
    onChange();
}