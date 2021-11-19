public void setMultiplier(int multiplier) {
    if (((this.value) == (entityPackage.Tile.BLOCKED_TILE)) || ((this.value) == (entityPackage.Tile.BUCKET_TILE))) {
        return ;
    }
    this.multiplier = multiplier;
}