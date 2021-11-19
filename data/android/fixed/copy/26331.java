private boolean contains(java.lang.String[] list, java.lang.String oldkey) {
    for (java.lang.String s : list)
        if (oldkey.equals(s))
            return true;
        
    
    return false;
}