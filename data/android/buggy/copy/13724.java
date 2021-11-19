public void removeMoveListener(java.util.function.Consumer<? super gr.entij.MoveEvent> toRemove) {
    gr.entij.Entity.removeListener(moveListeners, toRemove);
}