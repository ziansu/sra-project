public void setSelectedLocation(int id, boolean selected) {
    locations.setSelected(id, selected);
    update(UpdateType.LOCATION_SELECTION);
    reloadData();
}