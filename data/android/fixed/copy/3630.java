@java.lang.Override
public boolean collides(website.frontrow.board.Unit unit) {
    return (unit.getMotion().getY()) <= 0;
}