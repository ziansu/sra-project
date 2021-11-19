public void clear() {
    dataList.clear();
    stringDataList.clear();
    if ((filteredData) != null)
        filteredData.clear();
    
    com.adsamcik.signalcollector.adapters.FilterableAdapter.notifyDataSetChanged();
}