@java.lang.Override
public boolean doPickUp(com.shatteredpixel.shatteredpixeldungeon.actors.hero.Hero hero) {
    if (super.doPickUp(hero)) {
        com.shatteredpixel.shatteredpixeldungeon.utils.GLog.n(com.shatteredpixel.shatteredpixeldungeon.messages.Messages.get("chill"));
        com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Buff.affect(hero, com.shatteredpixel.shatteredpixeldungeon.items.quest.CorpseDust.DustGhostSpawner.class);
        return true;
    }
    return false;
}