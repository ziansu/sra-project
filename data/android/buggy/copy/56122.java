@java.lang.Override
public void trigger(ca.afroman.entity.api.Entity e) {
    updateTile();
    flop = !(flop);
    super.trigger(e);
}