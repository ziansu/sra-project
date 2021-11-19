public static boolean keysCheck(int keycode) {
    if ((keycode >= 0) && (keycode < (de.ImOlli.managers.KeyCheckManager.keys.length)))
        return de.ImOlli.managers.KeyCheckManager.keys[keycode];
    else
        return false;
    
}