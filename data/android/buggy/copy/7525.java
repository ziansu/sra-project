@java.lang.Override
public boolean contains(java.lang.Object o) {
    for (int i = 0; i < (array.length); i++)
        if (o == (array[i])) {
            return true;
        }
    
    return false;
}