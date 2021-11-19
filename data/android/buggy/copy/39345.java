@java.lang.Override
public boolean hasNext() {
    return (theAntiChain.nextSetBit(((current) + 1))) >= 0;
}