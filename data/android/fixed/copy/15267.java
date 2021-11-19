@java.lang.Override
public void onDetach() {
    super.onDetach();
    for (com.shatteredpixel.shatteredpixeldungeon.items.Item item : items) {
        ((com.shatteredpixel.shatteredpixeldungeon.items.wands.Wand) (item)).stopCharging();
    }
}