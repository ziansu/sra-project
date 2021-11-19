@java.lang.Override
public void add(E element) {
    if ((this.managedProvider) != null) {
        this.managedProvider.add(element);
    }else {
        throw new java.lang.IllegalStateException("ManagedProvider is not available");
    }
}