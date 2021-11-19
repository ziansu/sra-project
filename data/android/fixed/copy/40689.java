@java.lang.Override
public void restoreFromBundle(com.watabou.utils.Bundle bundle) {
    super.restoreFromBundle(bundle);
    introduced = bundle.optBoolean(com.watabou.pixeldungeon.actors.mobs.npcs.Ghost.INTRODUCED, false);
}