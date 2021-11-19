protected void filterChanged() {
    for (crazypants.enderio.conduit.gui.FilterChangeListener list : filterListeners) {
        list.onFilterChanged();
    }
}