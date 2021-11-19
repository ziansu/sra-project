@com.squareup.otto.Subscribe
public void onEpubDownloaded(pro.dbro.glance.events.EpubDownloadedEvent event) {
    showIndeterminateProgress(false);
    updateMetaUi();
    if (!(mShowingTips))
        showMetaUi(true);
    
}