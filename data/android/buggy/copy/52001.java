public static void setWordwrap(final java.lang.String wordwrap) {
    try {
        int ww = java.lang.Integer.parseInt(wordwrap);
        if (ww >= 0) {
            com.github.ricksbrown.cowsay.Message.wordwrap = ww;
        }
    } catch (java.lang.Throwable ignore) {
    }
}