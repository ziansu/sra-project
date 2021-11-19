@java.lang.Override
public void render() {
    if ((game) == null) {
        mainLayer.render();
        bgLayer.render();
    }else {
        game.render();
    }
}