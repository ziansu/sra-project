public boolean storeFavorites() {
    this.favorite.storeXML(this.getInternalStorage());
    return true;
}