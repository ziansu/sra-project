public bibliothek.gui.dock.DockElementRepresentative getMoveableElement() {
    if ((component.getTabCount()) > 0) {
        return component.getTabAt(0);
    }
    return null;
}