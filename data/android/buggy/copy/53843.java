@java.lang.Override
public void init(org.newdawn.slick.GameContainer container) throws org.newdawn.slick.SlickException {
    level = new Level();
    container.setTargetFrameRate(Game.FPS);
    container.setShowFPS(true);
    player = new Player();
    collision = new Collision();
    collisionIsTrue = false;
}