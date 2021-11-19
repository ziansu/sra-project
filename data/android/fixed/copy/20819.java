public void setGUI(me.legopal92.gamblr.menu.MainMenu gui, boolean init) {
    this.gui = gui;
    if (!init) {
        me.legopal92.gamblr.Gamblr.getInstance().getDealerConfig().set(this);
    }
}