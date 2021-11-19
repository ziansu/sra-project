void submit() {
    try {
        touchFiles();
        m_context.finish(null);
    } catch (java.lang.Exception e) {
        m_context.error(e);
    }
}