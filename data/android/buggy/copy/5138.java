@java.lang.Override
public int previousIndex() {
    if (!(hasPrevious()))
        return -1;
    
    return (index)--;
}