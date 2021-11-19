public void update() {
    if (de.wuffitv.openunicorn.entity.Player.move_permission) {
        if (de.wuffitv.openunicorn.KeyInput.W)
            de.wuffitv.openunicorn.entity.Player.player_y -= de.wuffitv.openunicorn.entity.Player.player_speed_y;
        
        if (de.wuffitv.openunicorn.KeyInput.A)
            de.wuffitv.openunicorn.entity.Player.player_x -= de.wuffitv.openunicorn.entity.Player.player_speed_x;
        
        if (de.wuffitv.openunicorn.KeyInput.S)
            de.wuffitv.openunicorn.entity.Player.player_y += de.wuffitv.openunicorn.entity.Player.player_speed_y;
        
        if (de.wuffitv.openunicorn.KeyInput.D)
            de.wuffitv.openunicorn.entity.Player.player_x += de.wuffitv.openunicorn.entity.Player.player_speed_x;
        
    }
}