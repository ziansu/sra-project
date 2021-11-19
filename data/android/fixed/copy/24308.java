public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.stencil = 8;
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new com.hh.ghoststory.GhostStory(), config);
}