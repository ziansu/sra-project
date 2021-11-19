public void addTile(android.content.ComponentName tile) {
    java.util.List<java.lang.String> newSpecs = new java.util.ArrayList<>(mTileSpecs);
    newSpecs.add(0, com.android.systemui.qs.external.CustomTile.toSpec(tile));
    changeTiles(mTileSpecs, newSpecs, true);
}