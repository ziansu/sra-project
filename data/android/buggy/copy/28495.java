@java.lang.Override
public void die() {
    java.lang.System.out.println("Hologram Item died:");
    java.lang.Thread.dumpStack();
    setLockTick(false);
    super.die();
}