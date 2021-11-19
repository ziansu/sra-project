@java.lang.Override
public void onCollectExtraUpdates(com.facebook.react.uimanager.UIViewOperationQueue uiUpdater) {
    super.onCollectExtraUpdates(uiUpdater);
    drawOutput();
    uiUpdater.enqueueUpdateExtraData(getReactTag(), this);
}