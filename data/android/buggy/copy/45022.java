@java.lang.Override
public void hideControlPoints() {
    if ((m_HandlerRegistrationManager) != null) {
        m_HandlerRegistrationManager.destroy();
    }
    m_HandlerRegistrationManager = null;
    m_connector.destroyPointHandles();
}