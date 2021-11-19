void setShowVisitedStatus(boolean showVisitedStatusParam) {
    showVisitedStatus = showVisitedStatusParam;
    if (!(showVisitedStatus)) {
        java.util.ArrayList<system.rss.Item> items = getAllItems();
        for (system.rss.Item item : items) {
            item.setVisited(true);
        }
    }
}