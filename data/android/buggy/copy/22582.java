@java.lang.Override
protected void mousePressed(bms.player.beatoraja.MainState state, int button, int x, int y) {
    ((bms.player.beatoraja.select.MusicSelector) (state)).getBarRender().mousePressed(this, button, x, y);
}