@java.lang.Override
public boolean isChanged() {
    return (super.isChanged()) && (((key.interestOps()) & (java.nio.channels.SelectionKey.OP_READ)) == 0);
}