public void onClick(net.joaolourenco.legame.graphics.menu.Menu m) {
    net.joaolourenco.legame.Registry.getMainClass().setWorld(new net.joaolourenco.legame.world.Tutorial());
    m.close();
}