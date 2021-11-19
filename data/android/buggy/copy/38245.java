private void onAuthorsClicked() {
    com.latrones.game.loader.Assets.getInstance().getMenuMusic().stop();
    game.setScreen(new com.latrones.game.screens.AuthorsScreen());
}