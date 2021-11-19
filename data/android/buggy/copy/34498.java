private static int maxPlantHeight(org.bukkit.block.Block plant) {
    switch (plant.getType()) {
        case CACTUS :
        case SUGAR_CANE_BLOCK :
            return 3;
        default :
            return 1;
    }
}