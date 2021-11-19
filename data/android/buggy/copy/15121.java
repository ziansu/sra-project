public <T extends net.shadowfacts.shadowmc.gui.AbstractGUI> T addChild(T child) {
    child.parent = this;
    child.zLevel = (zLevel) + 1;
    children.add(child);
    return child;
}