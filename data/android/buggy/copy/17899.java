public void destroy() {
    Starship.tex.destroy();
    model.destroy();
    game.removeShip(this);
}