public static void play(android.content.Context context, int resource) {
    aditi.hangman.Music.stop(context);
    android.util.Log.v(aditi.hangman.Music.TAG, "playing music");
    aditi.hangman.Music.mp = android.media.MediaPlayer.create(context, resource);
    aditi.hangman.Music.mp.start();
}