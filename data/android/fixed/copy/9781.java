private void dispatchPropertyEvent(gr.entij.PropertyEvent e) {
    propertyListeners = gr.entij.Entity.fireEvent(propertyListeners, e);
}