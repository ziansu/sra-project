@java.lang.Override
protected void restoreState() {
    for (menu.ColorMenu.ComponentState comp : this.componentStates) {
        comp.setSelectedColorMode(comp.getActiveColorMode());
    }
    componentList.clearSelection();
    colorList.clearSelection();
}