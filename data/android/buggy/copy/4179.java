private void showJoke(java.lang.String jokeString) {
    android.content.Intent jokeViewIntent = new android.content.Intent(this, com.example.eamon.jokeviewer.JokeViewActivity.class);
    jokeViewIntent.putExtra(JokeViewActivity.EXTRA_JOKE, com.example.JokeWizard.getJoke());
    this.startActivity(jokeViewIntent);
}