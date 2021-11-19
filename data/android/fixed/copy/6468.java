public void tick() {
    for (int i = 0; i < (object.size()); i++) {
        com.TwodTutorial.main.GameObject tempObject = object.get(i);
        tempObject.tick();
    }
}