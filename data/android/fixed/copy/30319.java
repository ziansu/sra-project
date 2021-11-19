@java.lang.Override
protected void onClick() {
    com.shatteredpixel.shatteredpixeldungeon.Dungeon.win(com.shatteredpixel.shatteredpixeldungeon.items.Amulet.class);
    com.shatteredpixel.shatteredpixeldungeon.Dungeon.deleteGame(Dungeon.hero.heroClass, true);
    com.watabou.noosa.Game.switchScene(com.shatteredpixel.shatteredpixeldungeon.scenes.RankingsScene.class);
}