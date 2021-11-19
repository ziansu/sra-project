@java.lang.Override
public int nextIndex() {
    if (!(hasNext()))
        return index;
    
    return (index)++;
}