@java.lang.Override
public void update() {
    if (!(getStats().isAlive())) {
        emptyPack();
        getStats().revive();
    }else {
        getStats().update();
    }
}