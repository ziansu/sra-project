public static void reset(final java.lang.String name, final boolean addBlank) {
    unnamed_platformer.game.other.World.current.localName = name;
    unnamed_platformer.game.other.World.current.levels.clear();
    if (addBlank) {
        unnamed_platformer.game.other.World.addBlankLevel();
    }
    unnamed_platformer.game.other.World.setLevelByIndex(0);
}