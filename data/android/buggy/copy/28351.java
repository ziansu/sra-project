public void dispose() {
    image.dispose();
    world.destroyBody(body);
    sprite = null;
}