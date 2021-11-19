@java.lang.Override
public void update(int delta) throws org.newdawn.slick.SlickException {
    super.update(delta);
    player1Input.poll();
    player2Input.poll();
}