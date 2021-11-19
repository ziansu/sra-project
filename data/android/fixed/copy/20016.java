private static void addSpawn(elucent.gravelores.block.BlockGravelOre block, int weight) {
    for (int i = 0; i < weight; i++) {
        elucent.gravelores.GravelOres.spawns.add(block);
    }
}