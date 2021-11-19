@java.lang.Override
public void setPosition(final long position, final int d) {
    if (position > 0)
        add(d);
    else
        remove(d);
    
}