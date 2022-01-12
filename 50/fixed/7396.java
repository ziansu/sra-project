public jenkins.widgets.HistoryPageFilter getHistoryPageFilter() {
    jenkins.widgets.HistoryPageFilter<T> historyPageFilter = newPageFilter();
    historyPageFilter.add(baseList);
    historyPageFilter.widget = this;
    return historyPageFilter;
}