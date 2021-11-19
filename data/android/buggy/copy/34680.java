@java.lang.Override
public void removeHandler() {
    if ((eventHandler) instanceof com.google.gwt.event.dom.client.ClickHandler) {
        this.clickHandlers.remove(eventHandler);
    }else
        if ((eventHandler) instanceof com.google.gwt.event.logical.shared.ValueChangeHandler<?>) {
            this.valueChangeHandlers.remove(eventHandler);
        }
    
}