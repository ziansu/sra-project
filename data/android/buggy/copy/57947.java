public void removeSearchQueryResults() {
    hideSearchResultCount();
    if (!(m_editingText)) {
        m_editText.setText("");
        showCloseButtonView(false);
    }
}