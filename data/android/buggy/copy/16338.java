public void tick() {
    for (int i = 0; i < (object.size()); i++) {
        com.trifluxgaming.game.entities.GameObject tempObject = object.get(i);
        tempObject.tick();
    }
}