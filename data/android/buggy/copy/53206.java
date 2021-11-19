private void getModifiers(int modifiers) {
    java.lang.String mods = java.lang.reflect.Modifier.toString(modifiers);
    if ((mods.length()) == 0) {
        return ;
    }
    sb.append((mods + " "));
}