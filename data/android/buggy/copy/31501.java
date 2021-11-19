public void synchronize() {
    this.storeAccount();
    fr.pasteque.client.utils.URLTextGetter.getText(fr.pasteque.client.sync.SyncUtils.apiUrl(this.ctx), fr.pasteque.client.sync.SyncUtils.initParams(this.ctx, "VersionAPI", "get"), new fr.pasteque.client.sync.SyncUpdate.DataHandler(fr.pasteque.client.sync.SyncUpdate.DataHandler.TYPE_VERSION));
}