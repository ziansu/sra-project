public java.util.List<games.strategy.triplea.ai.proAI.data.ProTerritory> getAll(final games.strategy.engine.data.Territory t) {
    final java.util.List<games.strategy.triplea.ai.proAI.data.ProTerritory> result = moveMaps.get(t);
    if (result != null) {
        return result;
    }
    return new java.util.ArrayList<games.strategy.triplea.ai.proAI.data.ProTerritory>();
}