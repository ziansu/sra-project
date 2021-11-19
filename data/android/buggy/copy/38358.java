public com.badlogic.gdx.Screen update(com.mygdx.game.Options.Names type) {
    if ((player) == null)
        player = new com.mygdx.game.player.Player(type);
    else
        player.change(type);
    
    return this;
}