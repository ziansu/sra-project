public static com.watabou.pixeldungeon.actors.Char findChar(int pos) {
    if ((pos > 0) && (pos < (com.watabou.pixeldungeon.actors.Actor.chars.length))) {
        return com.watabou.pixeldungeon.actors.Actor.chars[pos];
    }
    return null;
}