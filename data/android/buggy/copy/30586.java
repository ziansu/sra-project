@java.lang.Override
public void run() {
    java.lang.Object[] unstagedExpanded = unstagedViewer.getVisibleExpandedElements();
    java.lang.Object[] stagedExpanded = stagedViewer.getVisibleExpandedElements();
    refreshViewersInternal();
    unstagedViewer.setExpandedElements(unstagedExpanded);
    stagedViewer.setExpandedElements(stagedExpanded);
}