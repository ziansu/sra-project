@java.lang.Override
public org.apache.accumulo.core.iterators.SortedKeyValueIterator<org.apache.accumulo.core.data.Key, org.apache.accumulo.core.data.Value> iterator() throws java.io.IOException {
    if ((iflag) != null)
        ((org.apache.accumulo.core.iterators.system.InterruptibleIterator) (this.iter)).setInterruptFlag(iflag);
    
    return iter;
}