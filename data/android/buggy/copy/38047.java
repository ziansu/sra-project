public static void initRead() throws java.sql.SQLException {
    java.sql.Connection readConnection = RealisticBiomes.plugin.getPlantManager().getReadConnection();
    com.untamedears.realisticbiomes.persist.ChunkWriter.loadPlantsStmt = readConnection.prepareStatement(java.lang.String.format("SELECT w, x, y, z, date, growth, fruitGrowth FROM %s_plant WHERE chunkid = ?", com.untamedears.realisticbiomes.persist.ChunkWriter.curConfig.prefix));
}