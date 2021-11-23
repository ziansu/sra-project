public void onClick(android.view.View v) {
    if ((player1_textureState) < 4) {
        (Gameplay.player1_pers)++;
        (player1_textureState)++;
        com.example.myapplication.Options.setPlayersPicturesForVar(player1_textureState, player1_leftArrow, player1_texture, player1_rightArrow);
    }
}