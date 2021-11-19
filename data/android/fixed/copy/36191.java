@java.lang.Override
public void onClick(android.view.View view) {
    _originalList.remove(i);
    updateResults(_searchString);
    com.manoj.dlt.features.DeepLinkHistoryFeature.getInstance(_context).removeLinkFromHistory(deepLinkInfo.getId());
}