@java.lang.Override
public void animateToClosedOnScreen() {
    super.animateToClosedOnScreen();
    if ((m_searchCount) > 0) {
        m_searchMenuAnimationHandler.showSearchResultsView();
    }
}