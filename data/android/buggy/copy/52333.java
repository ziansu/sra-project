public embla3d.engine.items.Item createBoundingBox(java.lang.String id, java.lang.Float[] pPosition, float pScale, float[] pLength) {
    embla3d.engine.items.Item lItem = mNucleus.createBoundingBox(id, pPosition, pScale, pLength);
    mSceneVertex.add(lItem);
    return lItem;
}