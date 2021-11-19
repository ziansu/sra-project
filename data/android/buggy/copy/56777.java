public void update(float v) {
    if (this.hasInput()) {
        this.handleInput();
    }
    model.step(v);
    model.getPlayer().update(v);
    view.update(v);
}