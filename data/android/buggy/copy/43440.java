public void draw(gfx.camera.GameCamera camera, entity.mobs.PlayerMob perspective) {
    if (!(isActive))
        return ;
    
    getCurrentPhase().draw(camera, $missing$);
}