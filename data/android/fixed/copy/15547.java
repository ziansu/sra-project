public void add(models.TileModel tile) {
    if (!(_participants.contains(tile.getIdentifier()))) {
        _participants.add(tile.getIdentifier());
    }
}