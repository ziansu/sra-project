public void render(org.newdawn.slick.GameContainer gc, org.newdawn.slick.state.StateBasedGame sbg, org.newdawn.slick.Graphics graphics) throws org.newdawn.slick.SlickException {
    background.draw(0.0F, 0.0F);
    draw(graphics);
    drawLives(graphics);
}