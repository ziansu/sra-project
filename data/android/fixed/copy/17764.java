@com.squareup.otto.Subscribe
public void onEpubDownloaded(pro.dbro.glance.events.EpubDownloadedEvent event) {
    updateMetaUi();
    if (!(mShowingTips))
        showMetaUi(true);
    
}