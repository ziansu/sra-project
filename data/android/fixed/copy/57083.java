public boolean destroyEntity(com.totemdefender.entities.Entity ent) {
    if (ent == null)
        return false;
    
    if (!(entityDeleteQueue.contains(ent)))
        return entityDeleteQueue.add(ent);
    
    return false;
}