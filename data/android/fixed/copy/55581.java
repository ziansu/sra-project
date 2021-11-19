@java.lang.Override
public java.lang.String onPlaceholderReplace(be.maximvdw.placeholderapi.PlaceholderReplaceEvent pEvent) {
    java.lang.String clanTag = getClanTag(pEvent.getOfflinePlayer().getName());
    if (!(clanTag.isEmpty()))
        return CLAN_MATCHER.replaceFirst(clanTag);
    
    return clanTag;
}