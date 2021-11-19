public void addTriggersToEngine(io.slcc.os.triggers.TriggerEngine engine) {
    for (io.slcc.os.entities.AbstractEntity e : entities.getEntities()) {
        engine.addTriggers(e.getBasicTriggers());
    }
}