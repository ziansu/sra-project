public void update() {
    test += Time.deltaTime;
    shader.setUniform("test", ((float) (java.lang.Math.sin(test))));
}