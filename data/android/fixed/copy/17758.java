@java.lang.Override
public void close() {
    if ((delegate) != null)
        delegate.close();
    
    super.close();
}