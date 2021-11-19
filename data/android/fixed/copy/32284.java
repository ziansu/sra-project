void addToView(final ch.jeda.ui.View view) {
    if ((view != (this.view)) && ((this.view) != null)) {
        this.view.remove(this);
    }
    this.view = view;
}