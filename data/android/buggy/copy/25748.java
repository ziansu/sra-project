@java.lang.Override
public void run() {
    fp.sendBlockChange(loc, fw.getBlockAt(loc).getType(), fw.getBlockAt(loc).getData());
}