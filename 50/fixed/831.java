public void saveBlock(org.terasology.math.geom.Vector3i pos, org.terasology.world.block.Block block) {
    blockBufferComponent.blockBuffer.add(new org.terasology.dynamicCities.construction.BufferedBlock(pos, block));
}