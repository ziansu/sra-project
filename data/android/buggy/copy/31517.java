@java.lang.Override
public com.google.gwt.event.shared.HandlerRegistration addCloseHandler(final com.google.gwt.event.logical.shared.CloseHandler<gwt.material.design.client.ui.MaterialModal> handler) {
    return this.addHandler(new com.google.gwt.event.logical.shared.CloseHandler<gwt.material.design.client.ui.MaterialModal>() {
        @java.lang.Override
        public void onClose(com.google.gwt.event.logical.shared.CloseEvent<gwt.material.design.client.ui.MaterialModal> event) {
        }
    }, com.google.gwt.event.logical.shared.CloseEvent.getType());
}