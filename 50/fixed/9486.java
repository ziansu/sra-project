public void disableSearchTab() {
    if ((m_resultsTab) != null) {
        m_tabbedPanel.disableTab(m_resultsTab, org.opencms.ade.galleries.client.Messages.get().key(Messages.GUI_GALLERY_NO_PARAMS_0));
    }
}