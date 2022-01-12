public static boolean keysCheck(int keycode) {
    return ((keycode >= 0) && (keycode < (de.ImOlli.managers.KeyCheckManager.keys.length))) && (de.ImOlli.managers.KeyCheckManager.keys[keycode]);
}