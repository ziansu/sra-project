public void handleInput(float deltaT) {
    if (Gdx.input.isKeyPressed(Input.Keys.W)) {
        camera.position.x += 100 * deltaT;
        if (Gdx.input.isKeyPressed(Input.Keys.S))
            camera.position.x -= 100 * deltaT;
        
    }
}