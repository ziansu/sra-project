public static boolean pauseLongAudio(java.lang.String fname) {
    if (fname == null)
        return false;
    
    if (AudioPlayer.currentAudio.containsKey(fname)) {
        AudioPlayer.currentAudio.get(fname).pause();
        return true;
    }
    return false;
}