private boolean checkIfHistoryItemExists(java.lang.String text) {
    return ru.zerotime.translator.THistoryBookmarksProvider.mainHistoryTransMap.containsKey(text);
}