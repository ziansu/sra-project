@java.lang.Override
public void move(final long distance, final int d) {
    if (distance != 0)
        flags[d] = distance > 0;
    
}