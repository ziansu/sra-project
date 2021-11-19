public src.controller.Item removeTopItem(src.controller.Item i, int x, int y) {
    i.getMapRelation().associateWithMap(null);
    return current_map_reference_.removeTopItem(x, y);
}