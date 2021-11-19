private void destroy() {
    com.adrien.games.bagl.core.Engine.log.info("Destroying engine");
    game.destroy();
    window.destroy();
}