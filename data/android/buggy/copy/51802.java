public void reset() {
    physics.unregisterAll();
    entities.clear();
    allEntities.clear();
    load("level_test");
}