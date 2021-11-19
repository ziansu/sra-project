public void add(com.diego.civpocket.logic.Biomes biome) throws com.diego.civpocket.logic.Region.accionIlegalException {
    if (_biomesInRegion.contains(biome)) {
        throw new com.diego.civpocket.logic.Region.accionIlegalException();
    }
    _biomesInRegion.add(biome);
}