void addToView(final ch.jeda.ui.View view) {
    if ((view != (this.view)) && (view != null)) {
        view.remove(this);
    }
    this.view = view;
}