@java.lang.Override
public boolean act() {
    if ((lastDepth) != (com.watabou.pixeldungeon.Dungeon.depth)) {
        com.watabou.pixeldungeon.utils.GLog.p("Du warst zu lange weg. Kevin ist sauer!");
    }
    lastDepth = com.watabou.pixeldungeon.Dungeon.depth;
    return true;
}