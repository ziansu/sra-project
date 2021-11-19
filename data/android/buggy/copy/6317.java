public void setScene(com.connerdouglass.stargazer.scene.Scene scene) {
    if ((this.currentScene) != null)
        this.currentScene.setGame(null);
    
    this.currentScene = scene;
    if (scene != null)
        this.currentScene.setGame(this);
    
}