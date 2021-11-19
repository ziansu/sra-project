private void updateStatusBarLanguage() {
    statusBar_.getLanguage().setValue(fileType_.getLabel());
    boolean canShowScope = fileType_.canShowScopeTree();
    statusBar_.setScopeVisible(canShowScope);
    if (canShowScope)
        updateCurrentScope();
    
}