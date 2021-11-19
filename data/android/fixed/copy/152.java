@java.lang.Override
public void pressed() {
    getParent().get(game.level.resources.Moveable.class).open();
}