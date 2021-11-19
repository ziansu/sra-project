public static void ballpop() {
    if (!(com.group66.game.helpers.AudioManager.mute)) {
        try {
            com.group66.game.helpers.AudioManager.ballpop.play();
        } catch (java.lang.NullPointerException e) {
        }
    }
}