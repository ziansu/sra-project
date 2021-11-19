public void goToGameOver() {
    getFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new com.example.jonas.galgelegaflevering.GameOverFragment()).commit();
}