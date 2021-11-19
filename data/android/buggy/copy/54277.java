public void destroy() {
    gr.entij.EntityEvent destroyEvent = new gr.entij.EntityEvent(this, gr.entij.event.EntityEvent.Type.DESTROYED);
    gr.entij.Entity.fireEvent(entityListeners, destroyEvent);
}