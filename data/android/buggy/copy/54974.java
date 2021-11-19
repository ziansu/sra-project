public boolean canBuildRoad(shared.locations.EdgeLocation location) throws shared.exceptions.InvalidLocation {
    if (!(map.canPlaceRoadAtLoc(location))) {
        throw new shared.exceptions.InvalidLocation("");
    }
    return true;
}