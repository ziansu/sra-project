public void render(java.awt.Graphics g) {
    for (int i = 0; i < (object.size()); i++) {
        com.trifluxgaming.game.entities.GameObject tempObject = object.get(i);
        tempObject.render(g);
    }
}