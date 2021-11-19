public void removeSubAlbum(Album toRemove) {
    assert toRemove != null;
    toRemove.setParent(null);
    subAlbums.remove(toRemove);
    assert !(subAlbums.contains(toRemove));
    assert invariant();
}