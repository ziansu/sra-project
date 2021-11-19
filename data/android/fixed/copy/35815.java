public map.CoordinatePair addItem(item.Item item, map.CoordinatePair location) {
    itemsOnMap.add(new map.Pair(item, location));
    return location;
}