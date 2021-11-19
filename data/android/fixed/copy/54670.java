public void openPositionList(java.util.List<java.net.URL> urls) {
    if (!(confirmDiscard()))
        return ;
    
    prepareForNewPositionList();
    openPositionList(urls, getReadFormatsPreferredByExtension(getExtension(urls)));
}