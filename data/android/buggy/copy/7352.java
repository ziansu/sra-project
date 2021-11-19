public void addEntity(Entity e) {
    entities.add(0, e);
    if (e instanceof Obstacle) {
        entities.add(e);
    }else
        if (e instanceof Gas) {
            entities.add(e);
        }
    
}