@java.lang.Override
public void initStatesList(org.newdawn.slick.GameContainer arg0) throws org.newdawn.slick.SlickException {
    addState(new game.MainMenu());
    addState(new game.MainGame());
}