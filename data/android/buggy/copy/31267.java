private void setPositImpl(long posit, java.lang.Object move) {
    gr.entij.MoveEvent e = new gr.entij.MoveEvent(this, move, this.posit, posit);
    this.posit = posit;
    gr.entij.Entity.fireEvent(moveListeners, e);
}