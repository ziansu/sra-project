@java.lang.Override
public boolean contains(T item) {
    for (int i = 0; i < (listSize); i++)
        if (getNode(i).getValue().equals(item))
            return true;
        
    
    return false;
}