@java.lang.Override
public amfsmall.SmallBasicSet next() {
    int temp = current;
    current = theAntiChain.nextSetBit(((current) + 1));
    return new amfsmall.SmallBasicSet(temp);
}