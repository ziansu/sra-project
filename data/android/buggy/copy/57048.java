public java.lang.String comp(java.lang.String comp) {
    if (comp == null)
        throw NullPointerException();
    
    return c.get(comp);
}