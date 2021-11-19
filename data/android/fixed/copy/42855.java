@java.lang.Override
public int moveToNext(int position) {
    return (set.nextSetBit(((position - (offset)) + 1))) + (offset);
}