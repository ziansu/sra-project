@java.lang.Override
public void complete() {
    setCompleted(true);
    if (((m_manager) != null) && ((m_manager.getThreadLocalMessageTree().getMessage()) == null)) {
        m_manager.add(this);
    }
}