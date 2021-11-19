private void setHandlers() {
    com.google.gwt.user.client.DOM.sinkEvents(switchBlockDiv, (((com.google.gwt.user.client.Event.ONCLICK) | (com.google.gwt.user.client.Event.MOUSEEVENTS)) | (com.google.gwt.user.client.Event.TOUCHEVENTS)));
    com.google.gwt.user.client.DOM.setEventListener(switchBlockDiv, new org.iabako.client.ui.layout.field.InputSwitch.SwitchListener());
}