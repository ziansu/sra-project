@java.lang.Override
public void initStatesList(GameContainer gc) throws SlickException {
    this.getState(Game.menu).init(gc, this);
    this.getState(Game.play).init(gc, this);
    this.enterState(Game.menu);
}