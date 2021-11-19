public void addEdge(T from, T... tos) {
    for (T to : tos) {
        m_dependingOn.put(to, from);
        m_dependedUpon.put(from, to);
    }
}