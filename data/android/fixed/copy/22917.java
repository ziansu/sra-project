private void onAddRemove(gr.entij.Entity ent, gr.entij.EntityEvent.Type type) {
    addRemoveListeners = fireEvent(addRemoveListeners, new gr.entij.EntityEvent(ent, type));
}