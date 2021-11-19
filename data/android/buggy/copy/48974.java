@java.lang.Override
public void run() {
    this.getPlayerFlags(p).setTeleporting(true);
    p.teleport(location);
}