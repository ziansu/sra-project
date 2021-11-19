private void destroy() {
    com.adrien.games.bagl.core.Engine.log.info("Destroying engine");
    this.game.destroy();
    this.window.destroy();
}