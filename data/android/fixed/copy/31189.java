private void checkForFiltered(java.util.Collection<java.lang.String> list) {
    java.util.List<java.lang.String> copy = new java.util.LinkedList<>(list);
    if ((m_entriesToKeep) != null)
        copy.retainAll(m_entriesToKeep);
    
    intern(copy);
}