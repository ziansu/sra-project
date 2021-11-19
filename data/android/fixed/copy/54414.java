@java.lang.Override
protected void onClick() {
    if (enabled) {
        Dungeon.hero.handle(com.shatteredpixel.shatteredpixeldungeon.ui.AttackIndicator.lastTarget.pos);
    }
}