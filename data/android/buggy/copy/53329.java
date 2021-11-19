@java.lang.Override
public java.lang.String onPlaceholderReplace(be.maximvdw.placeholderapi.PlaceholderReplaceEvent pEvent) {
    return getClanTag(pEvent.getOfflinePlayer().getUniqueId());
}