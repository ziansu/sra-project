@java.lang.Override
public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent<java.lang.String> event) {
    try {
        this.init(getApplication());
    } catch (org.rapla.framework.RaplaException e) {
        logger.error(("Error updating history change: " + (e.getMessage())), e);
    }
}