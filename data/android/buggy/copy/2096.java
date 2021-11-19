@java.lang.Override
public int removeByMinecraft(final int minecraftID) {
    final int k = this.mirror.remove(minecraftID);
    if (k == (-1)) {
        return -1;
    }
    this.pattern.remove(k);
    return k;
}