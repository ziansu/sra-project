@java.lang.Override
public void to(final int c) {
    if (c < 0)
        throw new java.lang.IndexOutOfBoundsException();
    
    this.c = c;
}