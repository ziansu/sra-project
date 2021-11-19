public map.CoordinatePair addItem(item.Item item, map.CoordinatePair location) {
    itemsOnMap.add(new map.Pair<item.Item, map.CoordinatePair>(item, location));
}