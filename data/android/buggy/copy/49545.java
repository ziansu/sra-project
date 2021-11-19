public static com.alwaysrejoice.hexengine.dto.Game getGame() {
    android.util.Log.d("game", ("returning current game " + (com.alwaysrejoice.hexengine.util.GameUtils.game)));
    return com.alwaysrejoice.hexengine.util.GameUtils.game;
}