@java.lang.Override
public boolean remove(Key key, Value value) {
    synchronized(m_lock) {
        return m_data.remove(key, value);
    }
}