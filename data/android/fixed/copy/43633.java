@java.lang.Override
public int compareTo(me.jacobcrofts.droptable.entry.DropTableEntry<E> otherEntry) {
    if ((weight) > (otherEntry.weight)) {
        return 1;
    }
    if ((weight) < (otherEntry.weight)) {
        return -1;
    }
    return 1;
}