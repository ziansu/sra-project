public static void add(com.watabou.pixeldungeon.actors.Actor actor) {
    com.watabou.pixeldungeon.levels.LevelState.addDelayed(actor, com.watabou.pixeldungeon.levels.LevelState.getNow());
}