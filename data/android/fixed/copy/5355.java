public void render(world.Graphics g, int x, int y) {
    levelGraphics.render(g, x, y);
    for (gameobjects.BasicObject obj : basicObjects) {
        obj.render(g, x, y);
    }
}