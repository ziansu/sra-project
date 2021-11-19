@java.lang.Override
public void hideControlPoints() {
    if ((m_HandlerRegistrationManager) != null) {
        destroyPointHandles();
    }
}