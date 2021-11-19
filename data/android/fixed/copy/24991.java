public void setSelectedWO(geom.WorldObject wo) {
    if ((wo != null) && ((menu) == null)) {
        getDropdown("Object").setItem(wo);
        updateView(WindowTab.EDIT);
    }
}