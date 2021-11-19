public void focus() {
    focused = true;
    if ((prompting) && (!(readonly))) {
        com.vaadin.terminal.gwt.client.VConsole.log("location - line 1856 prompting focus()");
        setPromptingOff("");
    }
    tb.setFocus(true);
}