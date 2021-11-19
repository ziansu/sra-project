public void stopSound() {
    if (((com.gamesbykevin.a2048.activity.BaseActivity.MUSIC) != null) && (!(com.gamesbykevin.a2048.activity.BaseActivity.MUSIC.isEmpty()))) {
        for (java.lang.Integer key : com.gamesbykevin.a2048.activity.BaseActivity.MUSIC.keySet()) {
            stopSound(key);
        }
    }
}