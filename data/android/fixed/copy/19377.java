@java.lang.Override
public void dispose() {
    map.dispose();
    renderer.dispose();
    b2dr.dispose();
    hud.dispose();
    for (com.steve.flames.sprites.Player player : players)
        player.dispose();
    
}