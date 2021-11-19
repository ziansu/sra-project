@java.lang.Override
public boolean contains(java.lang.Object o) {
    for (int i = 0; i < (size); i++) {
        if (elements[i].equals(o))
            return true;
        
    }
    return false;
}