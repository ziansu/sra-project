@java.lang.Override
public boolean remove(java.lang.String element) {
    if (!(contains(element)))
        return false;
    
    if (element.isEmpty())
        return true;
    
    removePrefix(element);
    return true;
}