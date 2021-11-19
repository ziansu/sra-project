public void onClick(net.joaolourenco.legame.graphics.menu.Menu m) {
    net.joaolourenco.legame.Registry.getMainClass().setWorld(null);
    net.joaolourenco.legame.Registry.registerMenu(new net.joaolourenco.legame.graphics.menu.MainMenu());
    m.close();
}