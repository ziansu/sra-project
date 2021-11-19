@java.lang.Override
public void restoreFromBundle(com.watabou.utils.Bundle bundle) {
    super.restoreFromBundle(bundle);
    com.watabou.utils.Bundle node = bundle.getBundle(com.watabou.pixeldungeon.actors.mobs.npcs.Ghost.NODE);
    if (node.isNull()) {
        return ;
    }
    introduced = node.optBoolean(com.watabou.pixeldungeon.actors.mobs.npcs.Ghost.INTRODUCED, false);
}