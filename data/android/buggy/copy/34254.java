public static void reloadMap(int levelId) {
    com.retroMachines.data.AssetManager.maps.set(levelId, new com.badlogic.gdx.maps.tiled.TmxMapLoader().load((("maps/Level" + levelId) + ".tmx")));
}