public void setScene(com.connerdouglass.stargazer.scene.Scene scene) {
    if ((this.scene) != null)
        this.scene.setGame(null);
    
    this.scene = scene;
    if (scene != null)
        this.scene.setGame(this);
    
}