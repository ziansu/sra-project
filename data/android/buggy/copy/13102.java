public void addChild(de.tahigames.demondefense.engine.Entity child) {
    if ((entities) == null)
        entities = new java.util.ArrayList<>();
    
    entities.add(child);
    child.onAddToCore(core);
}