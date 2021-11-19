private void checkForFiltered(java.util.Collection<java.lang.String> list) {
    java.util.List<java.lang.String> copy = new java.util.LinkedList<>(list);
    copy.retainAll(m_entriesToKeep);
    intern(copy);
}