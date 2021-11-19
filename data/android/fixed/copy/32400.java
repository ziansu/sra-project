public void render(java.awt.Graphics g) {
    for (int i = 0; i < (object.size()); i++) {
        tempObject = object.get(i);
        tempObject.render(g);
    }
}