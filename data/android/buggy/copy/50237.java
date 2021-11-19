@java.lang.Override
public void onClick(android.view.View view) {
    if (moviePlayer.isPlaying()) {
        moviePlayer.pause();
    }else {
        try {
            moviePlayer.play();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}