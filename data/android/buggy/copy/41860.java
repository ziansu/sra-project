public void onClick(android.view.View v) {
    startActivity(game_intent);
    startService(new android.content.Intent(this, com.example.veronika.ball.MusicService.class));
}