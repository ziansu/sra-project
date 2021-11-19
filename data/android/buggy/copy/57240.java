public static void stop(android.content.Context context) {
    if ((aditi.hangman.Music.mp) != null) {
        android.util.Log.v(aditi.hangman.Music.TAG, "stopping music");
        aditi.hangman.Music.mp.stop();
        aditi.hangman.Music.mp.release();
        aditi.hangman.Music.mp = null;
    }
}