@java.lang.Override
public void tick() {
    super.tick();
    _lifetime = java.lang.Math.max(((_lifetime) - 1), 0);
    if ((_lifetime) == 0) {
        this.destroy();
    }
}