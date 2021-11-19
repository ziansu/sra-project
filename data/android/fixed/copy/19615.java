@java.lang.Override
public MerkleBNode createMBT() {
    if ((this.getRoot()) != null)
        return this.getRoot().createHashNode();
    
    return null;
}